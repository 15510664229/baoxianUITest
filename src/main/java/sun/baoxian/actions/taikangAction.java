package sun.baoxian.actions;
import com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListFilter;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebAssertionBase;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.taikangpage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

public class taikangAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    WebAssertionBase assertionBase=new WebAssertionBase();
    IdCardGenerator idCardGenerator=new IdCardGenerator();
    public void taikang2019_001()throws Exception{
        taikangpage page1=new taikangpage();
        Mobile mobile=new Mobile();
        page1.getPage("http://test.bxm.ncfimg.com/#/detail_externalv2?product_code=101911S0035&tid=14");
        action.click(page1.order());
        action.type(page1.name(),"自动化");
        String i1=idCardGenerator.generate("19931111","1");
        String m1=mobile.getTel();
        action.type(page1.idcard(),i1);
        action.sleep(4);
        action.type(page1.mobile(),m1);
        action.type(page1.sms_code(),"111111");
        Thread.sleep(3);
        //滑动页面使元素可见
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.pay_type());
        action.click(page1.shebao());
        action.click(page1.order());
        Thread.sleep(3);
        action.click(page1.confrim());
        action.DisplayElement(page1.pay());
//        action.sreenShot("report");
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());

    }
    public void taikang2019(String url,String m) throws Exception{
        driver.manage().deleteAllCookies();
        taikangpage page1=new taikangpage();
        Mobile mobile=new Mobile();
        page1.getPage(url);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.order());
        action.type(page1.name1(),"回归");
        String i1=idCardGenerator.generate("19931111","1");
        String m1=mobile.getTel();
        action.type(page1.idcard1(),i1);
        action.sleep(2);
        action.type(page1.mobile1(),m);
        action.sleep(2);
        action.type(page1.sms_code1(),"111111");
        Thread.sleep(3);
        //滑动页面使元素可见
        action.executeJS("window.scrollBy(0,400);");
        //不切换缴费方式，默认值
        Thread.sleep(3);
        action.click(page1.order());
        action.sleep(4);
        action.click(page1.confrim());
        if (action.isElementsPresent(page1.deadline(),10)){
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+m+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
        Reporter.log("测试地址"+url);
    }


}
