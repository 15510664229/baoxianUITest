package sun;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args){
        //1.拿到chromedriver 之后要将chromedriver 配置到环境变量中
        //2.通过脚本指定chromedriver 到路径
        //3.默认情况下selenium 会启动一个全新到浏览器，没有本地缓存和插件
        //4. 有的corome到安装路径不是默认到，此时selenium 默认找不到
        String url="http://test.bxm.ncfimg.com/#/detail_externalv2?product_code=101911S0035&tid=14";

        File file = new File("/Users/xueping.sun/driver/chromedriver1");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
//        WebDriver driver = new ChromeDriver();
//        driver.get(url);
//        String title = driver.getTitle();
//        System.out.println(title);

        //         driver.close();


        ChromeOptions options=new ChromeOptions();
//        options.addArguments("user-data-dir=~/Library/Application Support/Google/Chrome/Default");
        WebDriver driver1=new ChromeDriver(options);
        options.setHeadless(true);//此项开启后是没有界面的
        driver1.get(url);//输入网址
        File file1=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
        try {
            //利用FileUtils工具类的copy()方法保存getScreenshotAs()返回的文件对象。
            //看到网上有使用File.copyFile()方法，我这里测试的结果需要使用copy()方法
            Files.copy(file1, new File("/Users/xueping.sun/IdeaProjects/selenium/src/main/resources/image/screenfile.png"));
        } catch (IOException e) {
            // 异常处理
            e.printStackTrace();
        }

    }


}
