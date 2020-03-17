package sun.baoxian.actions;

import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.yangguangpage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

public class yangguangAction extends WebCaseBase {

    WebElementBase action = new WebElementBase();

    public void yangguangBW() throws Exception {
        yangguangpage page1 = new yangguangpage();
        IdCardGenerator idCardGenerator=new IdCardGenerator();
        Mobile mobile=new Mobile();
        page1.getPage("http://test.bxm.ncfimg.com/#/detail_accident?product_code=301910S0288");
        action.FindUitl(page1.find());
        action.type(page1.name(), "自动化");
        String m1=mobile.getTel();
        String i1=idCardGenerator.generate("19811210","0");
        action.type(page1.idcard(),i1);
        action.sleep(4);
        action.type(page1.mobile(), "18230288372");
        action.type(page1.sms_code(), "111111");
        Thread.sleep(3);
        //滑动页面使元素可见
        action.executeJS("window.scrollBy(0,400);");

        action.click_double(page1.order());
        Thread.sleep(3);
        action.click(page1.confrim());
        action.click(page1.rconfrim());
        action.DisplayElement(page1.pay());
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());

    }
    public void yangguangZH() throws Exception {
        yangguangpage page2 = new yangguangpage();
        IdCardGenerator idCardGenerator=new IdCardGenerator();
        Mobile mobile=new Mobile();
        page2.getPage("http://test.bxm.ncfimg.com/#/detail_accident?product_code=301910S0289");
        action.FindUitl(page2.find());
        action.type(page2.name(), "自动化");
        String i1=idCardGenerator.generate("19901210","0");
        String m1=mobile.getTel();
        action.type(page2.idcard(),i1 );
        action.sleep(4);
        action.type(page2.mobile(), m1);
        action.type(page2.sms_code(), "111111");
        Thread.sleep(3);
        //滑动页面使元素可见
        action.executeJS("window.scrollBy(0,400);");

        action.click_double(page2.order());
        Thread.sleep(3);
        action.click(page2.confrim());
        action.click(page2.rconfrim());
        action.DisplayElement(page2.pay());
        action.getUrl();
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());

    }
}
