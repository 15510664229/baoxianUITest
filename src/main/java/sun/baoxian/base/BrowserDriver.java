package sun.baoxian.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver startChrome() {
        WebDriver driver=new ChromeDriver();
        return driver;
    }
    /**
     * 需要自己指定chromedriver路径的时候，启动一个全新的浏览器进行测试
     * @param driverPath chromedriver的路径
     * @return
     */
    public static WebDriver startChrome(String driverPath) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions opiions=new ChromeOptions();
        opiions.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(opiions);
        return driver;
    }

    public static class WebCaseBase {
    }
}
