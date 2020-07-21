package sun.baoxian.actions.yuyuedan;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.iBaoCpage;
import sun.baoxian.pageObject.yuyuedan.homepage;
import sun.baoxian.pageObject.yuyuedan.iBaoC2page;
import sun.baoxian.pageObject.yuyuedan.loginpage;
import sun.baoxian.utils.SwipeScreenOrElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
                CreateElementScreenshot.screenShotForElement(driver, driver.findElement(By.cssSelector("img[class=\"verifyimg reloadverify\"]")), "D:\\selenium\\baoxianUITest\\res\\images\\imgver.png");
                action.sleep(5);
//        FileUtils.copyFile(CreateElementScreenshot.captureElement(driver.findElement(By.cssSelector("img[class=\"verifyimg reloadverify\"]"))), new File(file + "imgver1.png"));
                img = getcontent("D:\\selenium\\baoxianUITest\\res\\images\\imgver.png");

                System.out.println(i + "验证码是--------------------------------------------------------" + img);
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
    public  static  String getcontent(String imageFile){
        String content="";
        File image=new File(imageFile);
        ITesseract instance=new Tesseract();
        instance.setTessVariable("user_defined_dpi", "300");
        instance.setDatapath("D:\\selenium\\baoxianUITest\\src\\main\\resources\\tessdata");
        instance.setLanguage("eng");
        try {
            content =instance.doOCR(image).replaceAll("\n","");
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
