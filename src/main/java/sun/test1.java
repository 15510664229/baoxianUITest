package sun;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import sun.baoxian.base.BrowserDriver;

public class test1 {
    @Test
    public  void js() throws Exception{
        WebDriver driver = BrowserDriver.startChrome("/Users/xueping.sun/driver/chromedriver1");
        driver.get("https://www.baidu.com");
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("alert('hellow,world!')");
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
    }
}
