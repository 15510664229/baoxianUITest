package sun.baoxian.utils;


import com.google.common.io.Files;

import io.qameta.allure.Allure;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;


public class ScreenShotUtil {
    public WebDriver driver;
    private String screenName;
    private static Logger log = Logger.getLogger(ScreenShotUtil.class);

    public void setscreenName(String screenName) {
        this.screenName = screenName;
    }


    public ScreenShotUtil(WebDriver driver) {
        this.driver = driver;
    }

    private void takeScreenshot(String screenPath) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrFile, new File(screenPath));
            log.error("错误截图：" + screenPath);
            String imgaename = screenPath.split("snapshot")[1];
            Reporter.log("<a href=snapshot" + imgaename + " target=_blank><img src=snapshot/" + imgaename
                    + " style=width:30px;height:30px img/>失败截图</a>", true);
           // Allure.addAttachment("失败截图", new FileInputStream(new File("report/snapshot"+imgaename)));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void takeScreenshot() {
        String screenName = this.screenName + ".jpg";
        File dir = new File("report/snapshot/");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String screenPath = dir.getAbsolutePath() + "/" + screenName;
        this.takeScreenshot(screenPath);
    }
    public void takeScreenshot1() {
        String screenName = this.screenName + ".jpg";
        File dir = new File("report/snapshot/");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String screenPath = dir.getAbsolutePath() + "/" + screenName;
        this.sreenShot(screenPath);
    }


    /**
     * 截图写到日志里，截图全屏幕
     * @author xueping.sun
     *
     */
    public  void sreenShot(String screenPath){

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrFile, new File(screenPath));
            log.error("成功截图：" + screenPath);
            String imgaename = screenPath.split("snapshot")[1];
            Reporter.log("<a href=snapshot" + imgaename + " target=_blank><img src=snapshot/" + imgaename
                    + " style=width:30px;height:30px img/>成功截图</a>", true);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public  void sreenShot1(String screenPath){

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrFile, new File(screenPath));
            log.error("失败截图：" + screenPath);
            String imgaename = screenPath.split("snapshot")[1];
            Reporter.log("<a href=snapshot" + imgaename + " target=_blank><img src=snapshot/" + imgaename
                    + " style=width:30px;height:30px img/>失败截图</a>", true);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public void takeScreenshotfail() {
        String screenName = this.screenName + ".jpg";
        File dir = new File("report/snapshot/");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String screenPath = dir.getAbsolutePath() + "/" + screenName;
        this.sreenShot1(screenPath);
    }
}

