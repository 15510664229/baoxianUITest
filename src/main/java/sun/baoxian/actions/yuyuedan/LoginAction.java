package sun.baoxian.actions.yuyuedan;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.ImageHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.yuyuedan.homepage;
import sun.baoxian.pageObject.yuyuedan.loginpage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LoginAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    //火狐浏览器预约单后台登录流程
    public void login(String url) throws  Exception{
        loginpage page=new loginpage();
        homepage page1=new homepage();
        page.getPage(url);
        //等待页面加载
        action.pagefoload(15);
        action.type(page.username(),"admin");
        action.type(page.password(),"123456");

//        File file=new File("D:\\selenium\\baoxianUITest\\res\\images");
        String img="";
        for (int i=30;i>0;i--) {
            if (img.isEmpty()) {
                action.click(page.imgver());
                CreateElementScreenshot.screenShotForElement(driver, driver.findElement(By.cssSelector("img[class=\"verifyimg reloadverify\"]")), "res/images/imgver.png");
                action.sleep(5);
//        FileUtils.copyFile(CreateElementScreenshot.captureElement(driver.findElement(By.cssSelector("img[class=\"verifyimg reloadverify\"]"))), new File(file + "imgver1.png"));
                img = getcontent("res/images/imgver.png");
                Reporter.log( "第"+i+"次识别出来的验证码是      "+ img);

               // System.out.println(i + "验证码是--------------------------------------------------------" + img);
                if (img.length() < 4) {
                    img = "";
                }else {
                    action.type(page.verifycode(), img);
                    action.click(page.login());
                    action.sleep(6);
                    if (action.isElementsPresent(page.error(), 3)) {
                        String errmsg = action.getAttribute(page.error(), "innerHTML");
                        if (errmsg.equals("验证码错误:输入验证码不正确")) {
                            action.clear(page.verifycode());
                            img = "";
                        }
                    }
                }
            }
        }
        //登录成功
        action.sleep(4);
        driver.getPageSource();
        if ( action.isElementsPresent(page1.menu_yuyuedan(),10) ){
            Reporter.log("登陆成功  ");
        }else {
            Assert.fail("登陆失败 ");
        }
    }

    //图形验证码获取方法
    public  static  String getcontent(String imageFile) throws IOException {
        String content="";

//        BufferedImage textImage = ImageIO.read(new File(imageFile));
//        // 这里对图片黑白处理,增强识别率.这里先通过截图,截取图片中需要识别的部分
//        textImage = ImageHelper.convertImageToGrayscale(textImage);
//        // 图片锐化
//        textImage = ImageHelper.convertImageToBinary(textImage);
//        // 图片放大倍数,增强识别率(很多图片本身无法识别,放大5倍时就可以轻易识,但是考滤到客户电脑配置低,针式打印机打印不连贯的问题,这里就放大5倍)
//        textImage = ImageHelper.getScaledInstance(textImage, textImage.getWidth() * 1, textImage.getHeight() * 1);
//
//        textImage = ImageHelper.convertImageToBinary(textImage);
////        String saveImgPath = "/root/project/java/tesseract_model/temp_img";
////            String saveImgPath = "D:\\software\\ocr-tesseract\\img_tem\\temp.img";
//        ImageIO.write(textImage, "png", new File(imageFile));
//       // File image=new File(imageFile);
        ITesseract instance=new Tesseract();
        instance.setTessVariable("user_defined_dpi", "300");
//        instance.setDatapath("src/main/resources/tessdata");
         imageFile=dealImage(imageFile);
        instance.setDatapath("/usr/local/share/tessdata");
        instance.setLanguage("eng");
        try {
            content =instance.doOCR(new File(imageFile)).replaceAll("[^0-9a-zA-Z]","");

        }catch (TesseractException e){
            System.err.println(e.getMessage());
        }
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(content);

        return   m.replaceAll("").trim();
    }



    /**
     * 处理图片
     * 		其实可以不对图片做处理，直接使用Tess4j直接读取图片文字。
     * 		不过不经过图片处理的图片识别率较低，大概只有10%的成功率。
     * 		经过处理的图片，识别率提高到了50%左右。
     * @param imagePath 图片的绝对或相对路径
     * @return 处理后的图片保存路径
     * @throws IOException
     */
    public static String dealImage(String imagePath) throws IOException {
        String formatName = imagePath.substring(imagePath.indexOf(".") + 1);
        File file = new File(imagePath);
        BufferedImage image = ImageIO.read(file);

        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage outImage = new BufferedImage(width, height, image.getType());
        int backgroudColor = image.getRGB(0, 0);
        int backgroudR = (backgroudColor >> 16) & 0xff;
        int backgroudG = (backgroudColor >> 8) & 0xff;
        int backgroudB = backgroudColor & 0xff;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int color = image.getRGB(i, j);
                int r = (color >> 16) & 0xff;
                int g = (color >> 8) & 0xff;
                int b = color & 0xff;
                int newColor = color;

                // 去除干扰信息，干扰信息为黑色相近46/256之内全部清理
                if(r < 64 && g < 64 && b < 64) {
                    if(j-1 >= 0)
                        newColor = image.getRGB(i, j-1);
                    else if(i-1 >= 0)
                        newColor = image.getRGB(i-1, j);
                    else if(j+1 < height)
                        newColor = image.getRGB(i, j+1);
                    else if(i+1 < width)
                        newColor = image.getRGB(i+1, j);
                    r = (newColor >> 16) & 0xff;
                    g = (newColor >> 8) & 0xff;
                    b = newColor & 0xff;
                }

                // 去除背景颜色，相近的±30之内的全部设置为白色，灰色的干扰信息改为白色，文字改为黑色
                if(Math.abs((r - backgroudR)) <= 30 && Math.abs((g - backgroudG)) <= 30 && Math.abs((b - backgroudB)) <= 30) {
                    newColor = 0xffffff;
                } else if(r > 150 && g > 150 && b > 150){
                    newColor = 0xffffff;
                } else {
                    newColor = 0x000000;
                }
                outImage.setRGB(i, j, newColor);
            }
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(outImage, formatName, out);
        String outPath = new File(imagePath).getParent() + File.separator + getFileMd5(out.toByteArray()) + "." + formatName;
        File newFile = new File(outPath);
        ImageIO.write(outImage, formatName, newFile);
//        log.debug("处理后的验证码文件：" + outPath);

        return outPath;
    }


    /**
     * 根据文件字节流获取文件MD5
     * @param fileBytes
     * @return
     */
    public static String getFileMd5(byte[] fileBytes) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] mdBytes = md.digest(fileBytes);
            BigInteger bigInt = new BigInteger(1, mdBytes);
            return bigInt.toString(16);
        } catch (Exception e) {
//            log.error("删除文件失败",e);
            return null;
        }
    }

}
