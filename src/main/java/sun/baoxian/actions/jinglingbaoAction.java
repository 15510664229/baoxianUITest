package sun.baoxian.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.jinglingpage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.List;

public class jinglingbaoAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();
    public void jinglingbao_001() throws Exception {
        jinglingpage page1=new jinglingpage();
        String url="http://test.bxm.ncfimg.com/web1/#/taikang_accident/detail?product_code=301912S0047&tid=19";
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.executeJS("window.scrollBy(0,200);");
        action.click(page1.plan2000());
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.woyaotoubao());
        List<WebElement> list=new ArrayList<>();
        list=driver.findElements(By.cssSelector("input[placeholder='信息保密 仅用于投保']"));
        list.get(0).sendKeys("自动化");
        String m1=mobile.getTel();
        String i1=idCardGenerator.generate("19931210","1");
        list.get(1).sendKeys(i1);
        list.get(2).sendKeys(m1);
        action.type(page1.sms_code(),"111111");
        action.click(page1.submit());
        action.sleep(1);
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.confirm());
        action.sleep(3);
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
        Reporter.log(action.getUrl());
        Reporter.log("回归链接地址： "+url);
    }
    //线上回归
    public void jinglingbao_002(String url,String mobile) throws Exception {
        driver.manage().deleteAllCookies();
        jinglingpage page1=new jinglingpage();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(15);
        action.sleep(5);
        action.executeJS("window.scrollBy(0,200);");
        action.click(page1.plan2000());
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.woyaotoubao());
        List<WebElement> list=new ArrayList<>();
        list=driver.findElements(By.cssSelector("input[placeholder='信息保密 仅用于投保']"));
        list.get(0).sendKeys("回归");
        String i1=idCardGenerator.generate("19931210","1");
        list.get(1).sendKeys(i1);
        list.get(2).sendKeys(mobile);
        action.type(page1.sms_code(),"111111");
        action.click(page1.submit());
        action.sleep(1);
        action.click(page1.submit());
        action.sleep(2);
        action.click(page1.confirm());
        if (action.isElementsPresent(page1.deadline(),10)){
            action.successend();
        }else {
            action.click(page1.submit());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+mobile+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
        Reporter.log("回归链接地址： "+url);

    }


}
