package sun.baoxian.base;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class WebCaseBase {
    public static WebDriver driver;
    // 方法描述
    public static String description;
    private static Logger log = Logger.getLogger(WebCaseBase.class);


    @BeforeMethod
    @Parameters({"browerType"})
    public void setup(String browerType) throws IOException {
        log.info("------------------开始执行测试---------------");
         WebElementBase action = new WebElementBase();
        log.info("启动浏览器");
        switch (browerType.toLowerCase()) {
            case "chrome":
//        ChromeDriverService service;
//        service = new ChromeDriverService.Builder()
//           .usingDriverExecutable(new File("/Users/xueping.sun/driver/chromedriver1"))
//            .usingAnyFreePort().build();
//        service.start();
                System.setProperty("webdriver.chrome.driver", "/Users/xueping.sun/driver/chromedriver1");
                ChromeOptions headlessOptions = new ChromeOptions();
                headlessOptions.addArguments("--headless");
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
                this.driver =new ChromeDriver(capabilities);
                log.info("启动Chrome浏览器");
                break;
            case "ff":
                this.driver = new FirefoxDriver();
                log.info("启动Firefox浏览器");
                break;
            case "ie":
                this.driver = new InternetExplorerDriver();
                log.info("启动IE浏览器");
                break;
            case "edge":
                this.driver = new EdgeDriver();
                log.info("启动IE浏览器");
                break;
            case "mobile":
                this.driver=new MobileChromeDriver();
            default:
                this.driver = new ChromeDriver();
                log.info("启动默认浏览器（Chrome）");
                break;
        }
//        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws IOException {
        this.driver.quit();
        WebElementBase action = new WebElementBase();
        log.info("关闭浏览器");

    }

}

