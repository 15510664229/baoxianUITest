package sun.baoxian.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.MobileChromeDriver;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.duolaAbaopage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class duolaAbaoAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();

    /**
     * 火狐测试环境回归
     * @throws Exception
     */

    public void duolaAbao_001(String url) throws Exception {
        /**
         * 哆啦A保核测试环境跳转至收银台
         */
        duolaAbaopage page1 = new duolaAbaopage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(3);
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
        for (int i=0;i<4;i++){
            swp1.swipe(list.get(0), 20, 30, 20, 100);
            action.sleep(1);
        }
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = w.get(0).getText().replaceAll("/*-", "");
        w.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 100);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = w.get(1).getText().replaceAll("/*-", "");
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.baoe20());
        action.click(page1.payY());
        action.click(page1.exzlerci());
        action.click(page1.tdjb());
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jianggao_new());
        action.sleep(5);
        action.type(page1.ins_name(), "回归");
        String m1=mobile.getTel();
        String i1=idCardGenerator.generate(birth1,"1");
        action.type(page1.ins_idcard(),i1);
        action.type(page1.ins_mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), mobile.getEmail(4,6));
        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.address_new(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,200);");
        //job
        action.click(page1.job());
        //滑动选中职业
        action.sleep(3);

        WebElement el2 = driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']"));
        driver.getPageSource();

        Actions ta=new Actions(driver);
        ta.release();
        for (int i=0;i<3;i++) {
            ta.moveToElement(el2).clickAndHold().moveByOffset(0, -150).release().build().perform();
            action.sleep(2);
            driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
            action.sleep(4);
        }
        //选择完成，等待回到投保页面
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
//        //身高
//        action.click(page1.shengao());
//        action.sleep(2);
//        WebElement el5=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
//        Actions ta1=new Actions(driver);
//        ta1.release();
//        for (int i=0;i<17;i++) {
//            ta1.moveToElement(el5).clickAndHold().moveByOffset(0, -100).release().build().perform();
//            action.sleep(1);
//        }
//
//        driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
//        action.click(page1.queding());
//        action.sleep(2);
//        action.click(page1.tizhong());
//        action.sleep(2);
//        WebElement el6=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
//        Actions ta2=new Actions(driver);
//        ta2.release();
//        for (int i=0;i<10;i++) {
//            ta2.moveToElement(el6).clickAndHold().moveByOffset(0, -100).release().build().perform();
//            action.sleep(1);
//        }
//        driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
//        action.click(page1.queding());
//        action.sleep(2);

        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(3);
        action.click(page1.confrim());
        action.sleep(2);
        if (action.isElementsPresent(page1.pay(),10)){
            //action.DisplayElement(page1.pay());
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.submit());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }

        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("回归链接地址： "+url);
    }

//线上回归 chrome  暂时没有维护第一版跑过
    public void duolaAbao_002() throws Exception {
        duolaAbaopage page1 = new duolaAbaopage();
        page1.getPage("https://bxm.ncfimg.com/biz/page/info?page_id=27&goods_code=G1582255066&channel=124&fr=504&product_code=P7020200006&__pl__=");
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(3);
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
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.baoe20());
        action.click(page1.payY());
        action.click(page1.exzlerci());
        action.click(page1.tdjb());
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao());
        action.sleep(8);
        String url=action.getUrl();
        driver.quit();
        this.driver=new MobileChromeDriver(driver);
        driver.get(url);
        action.sleep(2);
        action.type(page1.ins_name(), "回归");
        String m1="18230288372";
        String i1=idCardGenerator.generate(birth1, "1");
        String n1=mobile.getChineseName();
        action.type(page1.ins_idcard(),i1);
        action.type(page1.ins_mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,400);");
        //job
        action.click(page1.job());
        action.sleep(1);
        List<WebElement> list2=new ArrayList<>();
        list2=driver.findElements(By.xpath("//*[text()='家庭主妇']"));
        list2.get(0).click();
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.click(page1.submit());
        action.sleep(7);
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("支付链接： "+action.getUrl());
    }

    /**
     * 火狐浏览器适配
     * @param url
     * @throws Exception
     */
    public void duolaAbao_003(String url) throws Exception {
        /**
         * 哆啦A保核保保司通不过，提交成功截图即为通过
         */
        duolaAbaopage page1 = new duolaAbaopage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(3);
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
        for (int i=0;i<4;i++){
        swp1.swipe(list.get(0), 20, 30, 20, 100);
        action.sleep(1);
        }
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = w.get(0).getText().replaceAll("/*-", "");
        w.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 100);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = w.get(1).getText().replaceAll("/*-", "");
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.baoe20());
        action.click(page1.payY());
        action.click(page1.exzlerci());
        action.click(page1.tdjb());
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao());
        action.sleep(5);
        action.type(page1.ins_name(), "孙雪萍");
        String m1="15510664229";
        String i1="150404199312100264";
        action.type(page1.ins_idcard(),i1);
        action.type(page1.ins_mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,200);");
        //job
        action.click(page1.job());
        //滑动选中职业
        action.sleep(3);

        WebElement el2 = driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']"));
        driver.getPageSource();

        Actions ta=new Actions(driver);
        ta.release();
        for (int i=0;i<3;i++) {
            ta.moveToElement(el2).clickAndHold().moveByOffset(0, -150).release().build().perform();
            action.sleep(2);
            driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
            action.sleep(4);
        }
        //选择完成，等待回到投保页面
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        //身高
        action.click(page1.shengao());
        action.sleep(2);
        WebElement el5=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        Actions ta1=new Actions(driver);
        ta1.release();
        for (int i=0;i<17;i++) {
            ta1.moveToElement(el5).clickAndHold().moveByOffset(0, -100).release().build().perform();
            action.sleep(1);
        }

        driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
        action.click(page1.queding());
        action.sleep(2);
        action.click(page1.tizhong());
        action.sleep(2);
        WebElement el6=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        Actions ta2=new Actions(driver);
        ta2.release();
        for (int i=0;i<10;i++) {
            ta2.moveToElement(el6).clickAndHold().moveByOffset(0, -100).release().build().perform();
            action.sleep(1);
        }
        driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
        action.click(page1.queding());
        action.sleep(2);

        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(3);
        action.click(page1.confrim());
        action.sleep(2);
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("回归链接地址： "+url);
    }
}
