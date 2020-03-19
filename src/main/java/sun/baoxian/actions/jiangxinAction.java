package sun.baoxian.actions;

import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.jiangxinpage;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

public class jiangxinAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();
    public void jiangxin_001() throws Exception {
        jiangxinpage page1=new jiangxinpage();
        page1.getPage("http://test.bxm.ncfimg.com/#/long_insurancev2/detail?product_code=301912S0049&tid=25");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
        //action.click(page1.male());
        String js="document.getElementsByClassName('am-list-extra').innerHTML='1993-12-10';";
        action.executeJS(js);
        action.click(page1.amount20());
        action.click(page1.internal30());
        action.click(page1.pay_Y());
        action.click(page1.submit());//投保
        action.sleep(2);
        action.click(page1.jiangao());
        action.sleep(3);
        action.type(page1.name(), "自动化");
        String m1= mobile.getTel();
        String i1=idCardGenerator.generate("19931210", "0");
        action.type(page1.idcard(),i1);
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.FindUitl(page1.bank_card());
        action.type(page1.bank_card(),"62179999000001111");
        action.click(page1.submitF());
        action.sleep(2);
        action.click(page1.confirm());
        action.sleep(6);
        action.DisplayElement(page1.deadline());
        //action.SnapshotForElement("res/images/", "jiangxin.png", page1.deadline());
       action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }

}
