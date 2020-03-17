package sun.baoxian.actions;
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
    public void order()throws Exception{
        IdCardGenerator idCardGenerator=new IdCardGenerator();
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


}
