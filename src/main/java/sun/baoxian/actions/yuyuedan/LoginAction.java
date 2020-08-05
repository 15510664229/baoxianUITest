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
import java.io.File;
import java.io.IOException;
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

        BufferedImage textImage = ImageIO.read(new File(imageFile));
        // 这里对图片黑白处理,增强识别率.这里先通过截图,截取图片中需要识别的部分
        textImage = ImageHelper.convertImageToGrayscale(textImage);
        // 图片锐化
        textImage = ImageHelper.convertImageToBinary(textImage);
        // 图片放大倍数,增强识别率(很多图片本身无法识别,放大5倍时就可以轻易识,但是考滤到客户电脑配置低,针式打印机打印不连贯的问题,这里就放大5倍)
        textImage = ImageHelper.getScaledInstance(textImage, textImage.getWidth() * 1, textImage.getHeight() * 1);

        textImage = ImageHelper.convertImageToBinary(textImage);
//        String saveImgPath = "/root/project/java/tesseract_model/temp_img";
//            String saveImgPath = "D:\\software\\ocr-tesseract\\img_tem\\temp.img";
        ImageIO.write(textImage, "png", new File(imageFile));
       // File image=new File(imageFile);
        ITesseract instance=new Tesseract();
//        instance.setTessVariable("user_defined_dpi", "300");
//        instance.setDatapath("src/main/resources/tessdata");
        instance.setDatapath("src/main/resources/tessdata");
        instance.setLanguage("eng");
        try {
            content =instance.doOCR(textImage).replaceAll("\n","");
//            content =instance.doOCR(image);

        }catch (TesseractException e){
            System.err.println(e.getMessage());
        }
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(content);

        return   m.replaceAll("").trim();
    }

}
