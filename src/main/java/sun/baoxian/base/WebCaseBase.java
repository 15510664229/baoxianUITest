package sun.baoxian.base;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
                System.setProperty("webdriver.chrome.driver", "/Users/xueping.sun/driver/chromedriver1");
                ChromeOptions headlessOptions = new ChromeOptions();
               // headlessOptions.addArguments("--headless");
               // headlessOptions.addArguments("--disable-gpu");
                headlessOptions.addArguments("no-sandbox");
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
                this.driver =new ChromeDriver(capabilities);
                log.info("启动Chrome浏览器");
                break;
            case "ff":
//                System.setProperty("webdriver.firefox.marionette","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//                this.driver = new FirefoxDriver();
                // 引入geckodriver驱动 ---第二个参数是驱动所在路径
                System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
// 新建一个firefox浏览器实例,并设置headless,不显示浏览器的情况下运行程序
                FirefoxBinary firefoxBinary = new FirefoxBinary();
//                firefoxBinary.addCommandLineOptions("--headless");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                this.driver = new FirefoxDriver(firefoxOptions);
//WebDriver driver = new FirefoxDriver();
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

