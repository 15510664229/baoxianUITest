package sun.baoxian.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.mamibaobeipage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;
import java.util.ArrayList;
import java.util.List;

public class mamibaobeiAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();

    public void mamibaobei_001() throws Exception {
        mamibaobeipage page1 = new mamibaobeipage();
        String url="http://test.bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0021";
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
//        action.click(page1.male());
        List<WebElement> w = new ArrayList<WebElement>();
        w = driver.findElements(By.className("am-list-extra"));
        w.get(0).click();
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 200);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = w.get(0).getText().replaceAll("/*-", "");
        w.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 150);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = w.get(1).getText().replaceAll("/*-", "");
        action.click(page1.baoe20());
        action.click(page1.period20());
        action.click(page1.pay10());
        action.click(page1.ercizhongji());
        action.click(page1.tejihanjianbing());
        action.click(page1.toubaorenhuomian());
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao());
        action.type(page1.ins_name(), "自动化");
        String m1=mobile.getTel();
        String i1=idCardGenerator.generate(birth1, "1");
        String i2=idCardGenerator.generate(birth2, "1");
        String n1=mobile.getChineseName();
        action.type(page1.ins_idcard(),i1);
        action.click(page1.changqi());
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.postcode(), "100000");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.type(page1.apl_idcard(), i2);
        action.type(page1.apl_name(), n1);
        action.executeJS("window.scrollBy(0,400);");
        //身高
        action.click(page1.shengao());
        action.sleep(2);
        WebElement element2 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp3 = new SwipeScreenOrElement(driver, element2);
        for (int i = 0; i < 2; i++) {
            swp3.swipe(element2, 20, 50, 20, 80);
            action.sleep(1);
        }
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        //体重
        action.click(page1.tizhong());
        action.sleep(2);
        WebElement element3 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp4 = new SwipeScreenOrElement(driver, element3);
        for (int i = 0; i < 4; i++) {
            swp4.swipe(element3, 400, 50, 400, 92);
            action.sleep(1);
        }
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.executeJS("window.scrollBy(0,800);");
        Actions actions = new Actions(driver);
        WebElement list1 = driver.findElement(By.xpath("//*[@class='mather-baby-protocol']//*[name()='svg']//*"));
        actions.click(list1).perform();
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(4);
        if (action.isElementsPresent(page1.deadline(),10)){
            action.successend();
        }else {
            action.click(page1.submit());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("被保人信息：姓名："+n1+"      "+"身份证号："+i2);
        Reporter.log("页面最后链接地址： "+action.getUrl());
        Reporter.log("回归链接地址： "+url);

    }
    //线上回归
    public void mamibaobei_002() throws Exception {
        mamibaobeipage page1 = new mamibaobeipage();
        page1.getPage("https://bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0021");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
//        action.click(page1.male());
        List<WebElement> w = new ArrayList<WebElement>();
        w = driver.findElements(By.className("am-list-extra"));
        w.get(0).click();
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 200);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = w.get(0).getText().replaceAll("/*-", "");
        w.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 150);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = w.get(1).getText().replaceAll("/*-", "");
        action.click(page1.baoe20());
        action.click(page1.period20());
        action.click(page1.pay10());
        action.click(page1.ercizhongji());
        action.click(page1.tejihanjianbing());
        action.click(page1.toubaorenhuomian());
        action.click(page1.submit());
        action.sleep(3);
        action.click(page1.jiangao());
        action.type(page1.ins_name(), "回归");
        String m1="18230288372";
        String i1=idCardGenerator.generate(birth1, "1");
        String i2=idCardGenerator.generate(birth2, "1");
        String n1=mobile.getChineseName();
        action.type(page1.ins_idcard(),i1);
        action.click(page1.changqi());
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.postcode(), "100000");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.type(page1.apl_idcard(), i2);
        action.type(page1.apl_name(), n1);
        action.executeJS("window.scrollBy(0,400);");
        //身高
        action.click(page1.shengao());
        action.sleep(2);
        WebElement element2 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp3 = new SwipeScreenOrElement(driver, element2);
        for (int i = 0; i < 2; i++) {
            swp3.swipe(element2, 20, 50, 20, 80);
            action.sleep(1);
        }
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        //体重
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        action.click(page1.tizhong());
        action.sleep(2);
        WebElement element3 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp4 = new SwipeScreenOrElement(driver, element3);
        for (int i = 0; i < 4; i++) {
            swp4.swipe(element3, 400, 50, 400, 100);
            action.sleep(1);
        }
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.executeJS("window.scrollBy(0,800);");
        Actions actions = new Actions(driver);
        WebElement list1 = driver.findElement(By.xpath("//*[@class='mather-baby-protocol']//*[name()='svg']//*"));
        actions.click(list1).perform();
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(4);
        action.DisplayElement(page1.deadline());
        action.successend();
        action.sleep(2);
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("被保人信息：姓名："+n1+"      "+"身份证号："+i2);
        Reporter.log("链接地址： "+action.getUrl());
    }
    public void mamibaobei_fox(String url,String mobile1) throws Exception {
        mamibaobeipage page1 = new mamibaobeipage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
//        action.click(page1.male());
        List<WebElement> w = new ArrayList<WebElement>();
        w = driver.findElements(By.className("am-list-extra"));
        w.get(0).click();
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        for(int i=0;i<3;i++){
        swp1.swipe(list.get(0), 20, 30, 20, 100);
        action.sleep(1);
        }
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = w.get(0).getText().replaceAll("/*-", "");
        w.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
       // SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 100);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = w.get(1).getText().replaceAll("/*-", "");
        action.click(page1.baoe20());
//        action.click(page1.period20());
//        action.click(page1.pay10());
//        action.click(page1.ercizhongji());
//        action.click(page1.tejihanjianbing());
//        action.click(page1.toubaorenhuomian());
        action.sleep(5);
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.jiangao());
        action.sleep(4);
        List<WebElement> listName = new ArrayList<>();
        List<WebElement> listIdCard = new ArrayList<>();
        listName=driver.findElements(By.cssSelector("input[placeholder='请输入真实姓名']"));
        listIdCard=driver.findElements(By.cssSelector("input[placeholder='请输入身份证号']"));
        String i1=idCardGenerator.generate(birth1, "1");
        String i2=idCardGenerator.generate(birth2, "1");
        String n1=mobile.getChineseName();
        listName.get(0).sendKeys("回归");
        listIdCard.get(0).sendKeys(i1);
//        action.type(page1.ins_name(),"回归");
//        action.type(page1.ins_idcard(),i1);
        action.click(page1.changqi());
        action.type(page1.mobile(), mobile1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.postcode(), "100000");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        listName.get(1).sendKeys(n1);
        listIdCard.get(1).sendKeys(i2);
//        action.type(page1.apl_idcard(), i2);
//        action.type(page1.apl_name(), n1);
        action.executeJS("window.scrollBy(0,400);");
        //身高
//        action.click(page1.shengao());
//        action.sleep(2);
//        WebElement element2 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
//        SwipeScreenOrElement swp3 = new SwipeScreenOrElement(driver, element2);
//        for (int i = 0; i < 5; i++) {
//            swp3.swipe(element2, 20, 50, 20, 80);
//            action.sleep(1);
//        }
//        driver.findElement(By.xpath("//*[text()='确定']")).click();
//        //体重
//        action.executeJS("window.scrollBy(0,400);");
//        action.sleep(2);
//        action.click(page1.tizhong());
//        action.sleep(2);
//        WebElement element3 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
//        SwipeScreenOrElement swp4 = new SwipeScreenOrElement(driver, element3);
//        for (int i = 0; i < 6; i++) {
//            swp4.swipe(element3, 400, 50, 400, 100);
//            action.sleep(1);
//        }
//        driver.findElement(By.xpath("//*[text()='确定']")).click();
        action.sleep(2);
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), mobile1);
        action.sleep(3);
//        action.click(page1.submit());
//        action.sleep(2);
//        action.click(page1.confirm());
//        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.executeJS("window.scrollBy(0,400);");
//        action.sleep(5);
//        WebElement element = driver.findElement(By.xpath("//*[@class='mather-baby-protocol']//*[name()='svg']//*"));
//        Actions ac = new Actions(driver);
//        ac.doubleClick(element);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(4);
        action.click(page1.confirm());
        action.DisplayElement(page1.deadline());
        action.successend();
        action.sleep(2);
        Reporter.log("投保人信息：手机号："+mobile1+"      "+"身份证号："+i1);
        Reporter.log("被保人信息：姓名："+n1+"      "+"身份证号："+i2);
        Reporter.log("页面最后链接地址： "+action.getUrl());
        Reporter.log("回归链接地址： "+url);
    }
}
