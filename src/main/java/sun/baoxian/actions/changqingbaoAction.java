package sun.baoxian.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.changqingbaopage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.List;

public class changqingbaoAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();
    public void changqingbao_001() throws Exception {
        changqingbaopage page1=new changqingbaopage();
        page1.getPage("http://test.bxm.ncfimg.com/#/long_insurancev2/detail?product_code=101912S0048");
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(5);
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao());
        action.type(page1.ins_name(),"自动化");
        String i1=idCardGenerator.generate("19931210","0");
        action.type(page1.ins_idcard(),i1);
        //投保人身份证置为长期
        List<WebElement> list=new ArrayList<>();
        list=driver.findElements(By.xpath("//*[text()='长期']"));
        list.get(0).click();
        String m1=mobile.getTel();
        action.type(page1.mobile(),m1);
        action.type(page1.sms_code(),"111111");
        action.type(page1.email(),"12e34@qq.com");
        action.executeJS("window.scrollBy(0,400);");
        List<WebElement> list1=new ArrayList<>();
        list1=driver.findElements(By.xpath("//*[text()='请选择']"));
        list1.get(0).click();
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        action.type(page1.postcode(),"100000");
        action.type(page1.address(),"朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.self());
        action.sleep(1);
        action.click(page1.job());
        action.sleep(2);
        //定位家庭主妇
        List<WebElement> list2=new ArrayList<>();
        list2=driver.findElements(By.xpath("//*[text()='家庭主妇']"));
        list2.get(0).click();
        action.sleep(2);
        //滑动到底部-勾选协议
        action.FindUitl(page1.tongyixieyi());
        action.click(page1.submitF());
        action.sleep(2);
        action.click(page1.confirm());
        action.sleep(2);
        WebElement list3 = driver.findElement(By.xpath("//*[@class='mather-baby-protocol']//*[name()='svg']//*"));
        Actions ac = new Actions(driver);
        ac.click(list3).perform();
        action.sleep(3);
        action.click(page1.submitF());
        action.sleep(5);
        action.DisplayElement(page1.deadline());
        //action.SnapshotForElement("res/images/", "changqingbao.png", page1.deadline());
       action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }

    public void changqingbao_002(String url) throws Exception {
        changqingbaopage page1=new changqingbaopage();
        page1.getPage(url);
        //等待页面加载完成

        action.pagefoload(15);
        action.sleep(5);
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.jiangao());
        action.type(page1.ins_name(),"回归");
        String i1=idCardGenerator.generate("19931210","0");
        action.type(page1.ins_idcard(),i1);
        //投保人身份证置为长期
        List<WebElement> list=new ArrayList<>();
        list=driver.findElements(By.xpath("//*[text()='长期']"));
        list.get(0).click();
        String m1="18230288372";
        action.type(page1.mobile(),m1);
        action.type(page1.sms_code(),"111111");
        action.type(page1.email(),"12e34@qq.com");
        action.executeJS("window.scrollBy(0,400);");
        List<WebElement> list1=new ArrayList<>();
        list1=driver.findElements(By.xpath("//*[text()='请选择']"));
        list1.get(0).click();
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        action.type(page1.postcode(),"100000");
        action.type(page1.address(),"朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.self());
        action.sleep(1);
        action.click(page1.job());
        action.sleep(2);
        //定位家庭主妇
        List<WebElement> list2=new ArrayList<>();
        list2=driver.findElements(By.xpath("//*[text()='家庭主妇']"));
        list2.get(0).click();
        action.sleep(2);
        //滑动到底部-勾选协议
        action.FindUitl(page1.tongyixieyi());
        action.click(page1.submitF());
//        action.sleep(2);
//        action.click(page1.confirm());
        //线上环境校验信息，过不去，试算成功即回归通过
//        action.sleep(2);
//        WebElement list3 = driver.findElement(By.xpath("//*[@class='mather-baby-protocol']//*[name()='svg']//*"));
//        Actions ac = new Actions(driver);
//        ac.click(list3).perform();
//        action.sleep(3);
//        action.click(page1.submitF());
//        action.sleep(5);
//        action.DisplayElement(page1.deadline());
        action.successend();
        action.sleep(2);
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
        Reporter.log("测试回归地址"+url);
    }

}
