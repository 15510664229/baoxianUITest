package sun.baoxian.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.damaipage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;
import java.util.ArrayList;
import java.util.List;

public class huaguidamaiAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();

    /**
     *  线上回归，ff浏览器
     * @param url
     * @throws Exception
     */
    public void damai(String url) throws Exception {
        damaipage  page1 = new damaipage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
       driver.findElement(By.xpath("//*[text()='出生日期']")).click();
       action.sleep(3);
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
        action.sleep(4);
        WebElement el3=driver.findElement(By.xpath("//div[text()='出生日期']/following-sibling::div[1]"));

        String birth = el3.getText().replaceAll("/*-", "");
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao());
        action.sleep(5);
        action.type(page1.ins_name(), "孙雪萍");
        String i1=idCardGenerator.generate(birth, "0");
        action.type(page1.ins_idcard(),i1);
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        String m1="15510664229";
        action.type(page1.ins_mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");

        //job
        action.click(page1.job());
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
        action.sleep(3);
        //身高
        action.click(page1.shengao());
        action.sleep(2);
        WebElement el5=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        Actions ta1=new Actions(driver);
        ta.release();
        for (int i=0;i<5;i++) {
            ta1.moveToElement(el5).clickAndHold().moveByOffset(0, -100).release().build().perform();
            action.sleep(3);
        }
        driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
        action.click(page1.queding());
        action.sleep(2);
        action.click(page1.tizhong());
        action.sleep(2);
        WebElement el4=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, el4);
        for (int i=0;i<6;i++){
            swp2.swipe(el4, 120, 30, 120, 100);
            action.sleep(2);
        }
        action.sleep(3);
        action.click(page1.queding());
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.confirm());
        String url1 = null;
        if (action.isElementsPresent(page1.pay(),10)){
             url1=action.getUrl();
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
        Reporter.log("支付链接： "+url1);
    }
    public void damai_test(String url) throws Exception {
        damaipage  page1 = new damaipage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
        driver.findElement(By.xpath("//*[text()='出生日期']")).click();
        action.sleep(3);
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
        action.sleep(4);
        WebElement el3=driver.findElement(By.xpath("//div[text()='出生日期']/following-sibling::div[1]"));

        String birth = el3.getText().replaceAll("/*-", "");
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao_new());
        action.sleep(5);
        action.type(page1.ins_name(), "回归");
        String i1=idCardGenerator.generate(birth, "0");
        action.type(page1.ins_idcard(),i1);
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        String m1=mobile.getTel();
        action.type(page1.ins_mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");

        //job
        action.click(page1.job());
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
        action.sleep(3);
        //身高
        action.click(page1.shengao());
        action.sleep(2);
        WebElement el5=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        Actions ta1=new Actions(driver);
        ta.release();
        for (int i=0;i<5;i++) {
            ta1.moveToElement(el5).clickAndHold().moveByOffset(0, -100).release().build().perform();
            action.sleep(3);
        }
        driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
        action.click(page1.queding());
        action.sleep(2);
        action.click(page1.tizhong());
        action.sleep(2);
        WebElement el4=driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, el4);
        for (int i=0;i<6;i++){
            swp2.swipe(el4, 120, 30, 120, 100);
            action.sleep(2);
        }
        action.sleep(3);
        action.click(page1.queding());
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.sleep(3);
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.confirm());
        String url1 = null;
        if (action.isElementsPresent(page1.pay(),10)){
            url1=action.getUrl();
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
        Reporter.log("支付链接： "+url1);
    }
}
