package sun.baoxian.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import sun.baoxian.base.MobileChromeDriver;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.jiankangbao2vpage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jiankangbao2vAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();
    public void jiankangbao_001() throws Exception {
        jiankangbao2vpage page1 = new jiankangbao2vpage();
        page1.getPage("http://test.bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0061");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //投保人与被保人 配偶关系
        List<WebElement> birth = new ArrayList<WebElement>();
        birth = driver.findElements(By.className("am-list-extra"));
        birth.get(0).click();
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 200);

        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = birth.get(0).getText().replaceAll("/*-", "");

        List<WebElement> sex=new ArrayList<>();
        sex=driver.findElements(By.xpath("//*[text()='男']"));
        sex.get(1).click();
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");

        birth.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        for (int i=0;i<2;i++){
        swp2.swipe(list.get(0), 20, 30, 20, 100);
        action.sleep(1);
        }
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = birth.get(1).getText().replaceAll("/*-", "");

        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.periodZ());
        action.click(page1.payY());
        action.click(page1.period15());
        action.click(page1.exzlbxj());
        action.click(page1.crtdjbbxj());
        action.click(page1.zdjbyljt());
        action.click(page1.sfqcjbzmqbxj());
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.jiangao());
        action.sleep(3);
        //生成投保数据
        String name1=mobile.getChineseName();
        String name2=mobile.getChineseName();
        String idcard_ins=idCardGenerator.generate(birth1,"0");
        String idcard_apl=idCardGenerator.generate(birth2,"1");
        String mobile_ins=mobile.getTel();
        String mobile_apl=mobile.getTel();
        String email1=mobile.getEmail(5,8);
        String address1=mobile.getRoad();
        action.type(page1.ins_name(),name1);
        action.sleep(2);
        action.type(page1.ins_idcard(),idcard_ins);
        action.type(page1.mobile(),mobile_ins);
        action.type(page1.sms_code(),"111111");
        action.type(page1.email(),email1);
        action.type(page1.address(),address1);
        action.type(page1.postcode(),"100000");
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        action.type(page1.apl_name(),name2);
        action.sleep(3);
        action.type(page1.apl_idcard(),idcard_apl);
        action.executeJS("window.scrollBy(0,500);");
        action.type(page1.apl_mobile(),mobile_apl);
        action.type(page1.bank_card(),"62170000121212233");
        action.type(page1.bank_mobile(),mobile_ins);
        action.click(page1.submitF());
        action.sleep(3);
        action.click(page1.confirm());
        action.sleep(3);
        //保司返回结果截图
        action.successend();
        action.sleep(10);
        action.executeJS("window.scrollBy(0,500);");
        Boolean flag=action.isElementsPresent(page1.pay(),3);
        if (flag){
        String url=action.getUrl();
        driver.quit();
        System.setProperty("webdriver.chrome.driver", "/Users/xueping.sun/driver/chromedriver1");
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        ChromeOptions headlessOptions = new ChromeOptions();
        headlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        headlessOptions.addArguments("no-sandbox");
       // headlessOptions.addArguments("--headless");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
        driver =new ChromeDriver(capabilities);

        driver.get(url);
        action.pagefoload(15);
        action.sleep(10);
        action.executeJS("window.scrollBy(0,500);");
        action.click(page1.pay());
        List<WebElement> smslist=new ArrayList<>();
        action.sleep(2);
        smslist=driver.findElements(By.xpath("//*[@class='sms-input']"));
        //((JavascriptExecutor)driver).executeScript("document.getElementById(\"ip0\").type ='text';");
        Actions ac=new Actions(driver);
        ac.moveToElement(smslist.get(0));
        ac.clickAndHold();
        for (int i=0;i<6;i++){
            ac.sendKeys(smslist.get(i),"1").perform();
        }
        action.sleep(8);
        action.DisplayElement(page1.success());
        action.successend();}
        // action.SnapshotForElement("res/images/", "mamibaobei.png", page1.deadline());
        Reporter.log("投保人信息：手机号："+mobile_ins+"      "+"身份证号："+idcard_ins);
        Reporter.log("被保人信息：姓名："+name2+"      "+"身份证号："+idcard_apl);


    }
    public void jiankangbao_002() throws Exception {
        jiankangbao2vpage page1 = new jiankangbao2vpage();
        page1.getPage("https://bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0061");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //投保人与被保人 配偶关系
        List<WebElement> birth = new ArrayList<WebElement>();
        birth = driver.findElements(By.className("am-list-extra"));
        birth.get(0).click();
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 200);

        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = birth.get(0).getText().replaceAll("/*-", "");

        List<WebElement> sex = new ArrayList<>();
        sex = driver.findElements(By.xpath("//*[text()='男']"));
        sex.get(1).click();
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");

        birth.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        for (int i = 0; i < 2; i++) {
            swp2.swipe(list.get(0), 20, 30, 20, 100);
            action.sleep(1);
        }
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = birth.get(1).getText().replaceAll("/*-", "");

        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.periodZ());
        action.click(page1.payY());
        action.click(page1.period15());
        action.click(page1.exzlbxj());
        action.click(page1.crtdjbbxj());
        action.click(page1.zdjbyljt());
        action.click(page1.sfqcjbzmqbxj());
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.jiangao());
        action.sleep(3);
        //生成投保数据
        String name1 = mobile.getChineseName();
        String name2 = mobile.getChineseName();
        String idcard_ins = idCardGenerator.generate(birth1, "0");
        String idcard_apl = idCardGenerator.generate(birth2, "1");
        String mobile_ins ="18230288372";
        String mobile_apl = mobile.getTel();
        String email1 = mobile.getEmail(5, 8);
        String address1 = mobile.getRoad();
        action.type(page1.ins_name(), "回归");
        action.sleep(2);
        action.type(page1.ins_idcard(), idcard_ins);
        action.type(page1.mobile(), mobile_ins);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), email1);
        action.type(page1.address(), address1);
        action.type(page1.postcode(), "100000");
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        action.type(page1.apl_name(), name2);
        action.sleep(3);
        action.type(page1.apl_idcard(), idcard_apl);
        action.executeJS("window.scrollBy(0,500);");
        action.type(page1.apl_mobile(), mobile_apl);
        action.type(page1.bank_card(), "62170000121212233");
        action.type(page1.bank_mobile(), mobile_ins);
        action.click(page1.submitF());
        action.sleep(3);
        action.click(page1.confirm());
        action.sleep(15);
        //输入短信验证码
        String url = action.getUrl();
        driver.quit();
        System.setProperty("webdriver.chrome.driver", "/Users/xueping.sun/driver/chromedriver1");
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        ChromeOptions headlessOptions = new ChromeOptions();
        headlessOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        headlessOptions.addArguments("no-sandbox");
       // headlessOptions.addArguments("--headless");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, headlessOptions);
        driver = new ChromeDriver(capabilities);
        driver.get(url);
        action.pagefoload(15);
        action.sleep(10);
        action.executeJS("window.scrollBy(0,500);");
//        action.click(page1.pay());
//        List<WebElement> smslist = new ArrayList<>();
//        action.sleep(2);
//        smslist = driver.findElements(By.xpath("//*[@class='sms-input']"));
//        Actions ac = new Actions(driver);
//        ac.moveToElement(smslist.get(0));
//        ac.clickAndHold();
//        for (int i = 0; i < 6; i++) {
//            ac.sendKeys(smslist.get(i), "1").perform();
//        }
//        action.sleep(8);
//        action.DisplayElement(page1.success());
        action.successend();
        action.sleep(3);
        Reporter.log("投保人信息：手机号：" + mobile_ins + "      " + "身份证号：" + idcard_ins);
        Reporter.log("被保人信息：姓名：" + name2 + "      " + "身份证号：" + idcard_apl);
    }
    public void jiankangbao_fox(String url) throws Exception {
        jiankangbao2vpage page1 = new jiankangbao2vpage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //投保人与被保人 配偶关系
        List<WebElement> birth = new ArrayList<WebElement>();
        birth = driver.findElements(By.className("am-list-extra"));
        birth.get(0).click();
        action.sleep(3);
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        for (int i=0;i<3;i++) {
            swp1.swipe(list.get(0), 20, 30, 20, 100);
            action.sleep(1);
        }

        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = birth.get(0).getText().replaceAll("/*-", "");

        List<WebElement> sex=new ArrayList<>();
        sex=driver.findElements(By.xpath("//*[text()='男']"));
        sex.get(1).click();
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");

        birth.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        for (int i=0;i<5;i++){
            swp2.swipe(list.get(0), 20, 30, 20, 100);
            action.sleep(1);
        }
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = birth.get(1).getText().replaceAll("/*-", "");

        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.periodZ());
        action.click(page1.payY());
        action.click(page1.period15());
        action.click(page1.exzlbxj());
        action.click(page1.crtdjbbxj());
        action.click(page1.zdjbyljt());
        action.click(page1.sfqcjbzmqbxj());
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.jiangao());
        action.sleep(3);
        //生成投保数据
        String name1=mobile.getChineseName();
        String name2=mobile.getChineseName();
        String idcard_ins=idCardGenerator.generate(birth1,"0");
        String idcard_apl=idCardGenerator.generate(birth2,"1");
        String mobile_ins=mobile.getTel();
        String mobile_apl=mobile.getTel();
        String email1=mobile.getEmail(5,8);
        String address1=mobile.getRoad();
        action.type(page1.ins_name(),name1);
        action.sleep(2);
        action.type(page1.ins_idcard(),idcard_ins);
        action.type(page1.mobile(),"18230288372");
        action.type(page1.sms_code(),"111111");
        action.type(page1.email(),email1);
        action.type(page1.address(),address1);
        action.type(page1.postcode(),"100000");
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        action.type(page1.apl_name(),name2);
        action.sleep(3);
        action.type(page1.apl_idcard(),idcard_apl);
        action.executeJS("window.scrollBy(0,500);");
        action.type(page1.apl_mobile(),mobile_apl);
        action.type(page1.bank_card(),"62170000121212433");
        action.type(page1.bank_mobile(),mobile_ins);
        action.sleep(2);
        action.click(page1.submitF());
        action.sleep(3);
        action.click(page1.confirm());
        action.sleep(10);
        //输入短信验证码
        action.executeJS("window.scrollBy(0,500);");
 //       action.click(page1.pay());//跳转至支付页面即为成功
//        List<WebElement> smslist=new ArrayList<>();
//        action.sleep(2);
//        smslist=driver.findElements(By.xpath("//*[@class='sms-input']"));
//        Actions ac=new Actions(driver);
//        ac.moveToElement(smslist.get(0));
//        ac.clickAndHold();
//        for (int i=0;i<6;i++){
//            ac.sendKeys(smslist.get(i),"1").perform();
//        }
//        action.sleep(8);
//        action.DisplayElement(page1.success());
        action.successend();
        // action.SnapshotForElement("res/images/", "mamibaobei.png", page1.deadline());
        Reporter.log("投保人信息：手机号：18230288372"+"      "+"身份证号："+idcard_ins);
        Reporter.log("被保人信息：姓名："+name2+"      "+"身份证号："+idcard_apl);


    }

}

