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

public class MobileChromeDriver extends ChromeDriver implements HasTouchScreen {
    private RemoteTouchScreen touch;
    private WebDriver driver;

    public MobileChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/xueping.sun/driver/chromedriver1");
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        ChromeOptions headlessOptions = new ChromeOptions();
        headlessOptions.addArguments("--headless");
        headlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
        this.driver =new ChromeDriver(capabilities);
        touch = new RemoteTouchScreen(getExecuteMethod());
    }

    public TouchScreen getTouch() {
        return touch;
    }
}
