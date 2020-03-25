package sun.baoxian.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.kaixinbaobeipage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.List;

public class kaixinbaobeiAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();

    public void kaixinbaobei_001() throws Exception {
        kaixinbaobeipage page1=new kaixinbaobeipage();
        page1.getPage("http://test.bxm.ncfimg.com/#/detail_serious_illness?product_code=701909S0033");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.baoe30w());
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.fuhe());
        action.sleep(2);
        List<WebElement> list=driver.findElements(By.cssSelector("input[data-type='name']"));
        List<WebElement> list1=driver.findElements(By.cssSelector("input[data-type='identity']"));
        String name1=mobile.getChineseName();
        String name2=mobile.getChineseName();
        String m1=mobile.getTel();
        String i1=idCardGenerator.generate("19811121","0");
        String i2=idCardGenerator.generate("20180101","1");
        list.get(0).sendKeys(name1);
        action.sleep(1);
        list1.get(0).sendKeys(i1);
        action.type(page1.mobile(),m1);
        action.type(page1.sms_code(),"111111");
        action.executeJS("window.scrollBy(0,300);");
        action.click(page1.city());
        action.sleep(1);
        action.click(page1.sure());
        action.executeJS("window.scrollBy(0,200);");
        list.get(1).sendKeys(name2);
        action.sleep(2);
        list1.get(1).sendKeys(i2);
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.baoe30w());
        //action.click(page1.peroid60());
        //切换年缴
        action.click(page1.pay_type());
        action.click(page1.quzhifu());
        action.sleep(2);
        action.click(page1.confrim());
        action.sleep(3);
        action.click(page1.addbankcard());
        action.sleep(2);
        action.click(page1.code());
        action.sleep(1);
        action.click(page1.sure());
        action.type(page1.bankcard(),"62140811112222343");
        action.type(page1.mobile1(),m1);
        action.type(page1.sms(),"111111");
        action.executeJS("window.scrollBy(0,300);");
        action.click(page1.queren());
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        Actions actions = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath("//*[@class='icon-sel']/*[name()='svg']/*"));
        actions.click(element1).perform();
        action.sleep(3);
        action.click(page1.bangka());
        action.sleep(6);
        action.DisplayElement(page1.success());
        //action.Snapshot("res/images/", "kaixinbaobei.png");
        action.successend();
        Reporter.log("投保人信息：姓名："+name1+"    手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("被保人信息：姓名："+name2+"      "+"身份证号："+i2);

    }
    //线上回归 但是没找到线上链接 估计是停了
    public void kaixinbaobei_002() throws Exception {
        kaixinbaobeipage page1=new kaixinbaobeipage();
        page1.getPage("http://test.bxm.ncfimg.com/#/detail_serious_illness?product_code=701909S0033");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.baoe30w());
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.fuhe());
        action.sleep(2);
        List<WebElement> list=driver.findElements(By.cssSelector("input[data-type='name']"));
        List<WebElement> list1=driver.findElements(By.cssSelector("input[data-type='identity']"));
        String name1=mobile.getChineseName();
        String name2=mobile.getChineseName();
        String m1="18230288372";
        String i1=idCardGenerator.generate("19811121","0");
        String i2=idCardGenerator.generate("20180101","1");
        list.get(0).sendKeys(name1);
        action.sleep(1);
        list1.get(0).sendKeys(i1);
        action.type(page1.mobile(),m1);
        action.type(page1.sms_code(),"111111");
        action.executeJS("window.scrollBy(0,300);");
        action.click(page1.city());
        action.sleep(1);
        action.click(page1.sure());
        action.executeJS("window.scrollBy(0,200);");
        list.get(1).sendKeys(name2);
        action.sleep(2);
        list1.get(1).sendKeys(i2);
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.baoe30w());
        //action.click(page1.peroid60());
        //切换年缴
        action.click(page1.pay_type());
        action.click(page1.quzhifu());
        action.sleep(2);
        action.click(page1.confrim());
        action.sleep(3);
        action.click(page1.addbankcard());
        action.sleep(2);
        action.click(page1.code());
        action.sleep(1);
        action.click(page1.sure());
        action.type(page1.bankcard(),"62140811112222343");
        action.type(page1.mobile1(),m1);
        action.type(page1.sms(),"111111");
        action.executeJS("window.scrollBy(0,300);");
        action.click(page1.queren());
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        Actions actions = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath("//*[@class='icon-sel']/*[name()='svg']/*"));
        actions.click(element1).perform();
        action.sleep(3);
        action.click(page1.bangka());
        action.sleep(6);
        action.DisplayElement(page1.success());
        //action.Snapshot("res/images/", "kaixinbaobei.png");
        action.successend();
        Reporter.log("投保人信息：姓名："+name1+"    手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("被保人信息：姓名："+name2+"      "+"身份证号："+i2);
    }
}
