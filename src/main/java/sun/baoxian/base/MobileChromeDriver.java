package sun.baoxian.base;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;

import java.util.HashMap;
import java.util.Map;

public class MobileChromeDriver extends ChromeDriver {
    private RemoteTouchScreen touch;
    //private WebDriver driver;

    public MobileChromeDriver(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "root/Users/xueping.sun/driver/chromedriver1");
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        ChromeOptions headlessOptions = new ChromeOptions();
        headlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        headlessOptions.addArguments("no-sandbox");
        headlessOptions.addArguments("--headless");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
        driver =new ChromeDriver(capabilities);
        WebElementBase action = new WebElementBase();
    }
}
