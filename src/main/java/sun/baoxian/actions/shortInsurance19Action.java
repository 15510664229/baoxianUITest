package sun.baoxian.actions;

import org.bytedeco.javacpp.presets.opencv_core;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.shortTmp;
import sun.baoxian.utils.ScreenShotUtil;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

public class shortInsurance19Action extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();
    String i1=idCardGenerator.generate("19921210", "0");
    String m1=mobile.getTel();


    public void shortTmptest(String url) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(5);
        action.click(page1.order());
        action.type(page1.name(), "自动化");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
      //  action.click(page1.shebao());
       // action.click(page1.pay_type());
        action.click(page1.order());
        action.sleep(2);
        action.click(page1.confrim());
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(2);
        action.DisplayElement(page1.pay());
        action.getUrl();
        //action.SnapshotForElement("res/images/", "taikang.png", page1.pay());
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }

//    public void yiyuanM_001() throws Exception {
//        shortTmp page1 = new shortTmp();
//        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=71&is_gray=1&goods_code=G1579598079");
//        //等待页面加载完成
//        action.pagefoload(10);
//        action.click(page1.order());
//        action.type(page1.name(), "自动化");
//        action.sleep(1);
//        action.type(page1.idcard(), i1);
//        action.type(page1.mobile(), m1);
//        action.type(page1.sms_code(), "111111");
//        //滑动页面使元素可见
//        action.sleep(2);
//        String js2 = "window.scrollBy(0,400);";
//        action.executeJS(js2);
//        action.click(page1.shebao());
//        action.click(page1.order());
//        action.sleep(2);
//        action.click(page1.confrim());
//        action.sleep(2);
//        action.DisplayElement(page1.pay());
//        action.getUrl();
//        action.successend();
//        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
//        Reporter.log(action.getUrl());
//
//    }
//
//    public void yiyuanY_001() throws Exception {
//        shortTmp page1 = new shortTmp();
//        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=70&is_gray=1&goods_code=G1580975301");
//        //等待页面加载完成
//        action.pagefoload(10);
//        action.click(page1.order());
//        action.type(page1.name(), "自动化");
//        action.sleep(1);
//        action.type(page1.idcard(), idCardGenerator.generate("19921210", "0"));
//        action.type(page1.mobile(), "18230288372");
//        action.type(page1.sms_code(), "111111");
//        //滑动页面使元素可见
//        action.sleep(2);
//        action.executeJS("window.scrollBy(0,400);");
//        action.click(page1.shebao());
//        action.click(page1.order());
//        action.sleep(2);
//        action.click(page1.confrim());
//        action.sleep(2);
//        action.DisplayElement(page1.pay());
//        action.successend();
//        //action.SnapshotForElement("res/images","taikang.png",page1.pay());
//    }

    public void pinghuaY_001() throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=73&is_gray=1&goods_code=G1581331275");
        //等待页面加载完成
        action.pagefoload(10);
        action.click(page1.order());
        action.type(page1.name(), "自动化");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
//        action.click(page1.pay_type());
        action.click(page1.shebao());
        action.click(page1.order());
        action.sleep(2);
        action.click(page1.confrim());
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(2);
        action.DisplayElement(page1.pay());
        action.getUrl();
        action.successend();
        //action.SnapshotForElement("res/images","taikang.png",page1.pay());
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }

    /**
     * 防癌卫士
     *
     * @throws Exception
     */
//    public void zhonghui1() throws Exception {
//        shortTmp page1 = new shortTmp();
//        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=177&is_gray=1&goods_code=G1582880569");
//        //等待页面加载完成
//        action.pagefoload(10);
//        action.click(page1.order());
//        action.type(page1.name(), "自动化");
//        action.type(page1.idcard(),i1 );
//        action.type(page1.mobile(), m1);
//        action.type(page1.sms_code(), "111111");
//        //滑动页面使元素可见
//        action.sleep(2);
//        action.executeJS("window.scrollBy(0,400);");
////        action.click(page1.pay_type());
//        action.click(page1.shebao());
//        action.click(page1.order());
//        action.sleep(2);
//        action.click(page1.confrim());
//        action.DisplayElement(page1.pay());
//        action.getUrl();
//        action.successend();
//        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
//        Reporter.log(action.getUrl());
//    }
//
//    public void zhonghui3() throws Exception {
//        shortTmp page1 = new shortTmp();
//        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=176&is_gray=1&goods_code=G1582881659");
//        //等待页面加载完成
//        action.pagefoload(10);
//        action.click(page1.order());
//        action.type(page1.name(), "自动化");
//        action.sleep(1);
//        action.type(page1.idcard(), i1 );
//        action.type(page1.mobile(), m1);
//        action.type(page1.sms_code(), "111111");
//        //滑动页面使元素可见
//        action.sleep(2);
//        action.executeJS("window.scrollBy(0,400);");
////        action.click(page1.pay_type());
//        action.click(page1.shebao());
//        action.click(page1.order());
//        action.sleep(2);
//        action.click(page1.confrim());
//        action.DisplayElement(page1.pay());
//        action.getUrl();
//        action.successend();
//        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
//        Reporter.log(action.getUrl());
//    }
//
//    public void zhonghuiPH() throws Exception {
//        shortTmp page1 = new shortTmp();
//        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=178&is_gray=1&goods_code=G1582702861");
//        //等待页面加载完成
//        action.pagefoload(10);
//        action.click(page1.order());
//        action.type(page1.name(), "自动化");
//        action.sleep(1);
//        action.type(page1.idcard(), i1);
//        action.type(page1.mobile(), m1);
//        action.type(page1.sms_code(), "111111");
//        //滑动页面使元素可见
//        action.sleep(2);
//        action.executeJS("window.scrollBy(0,400);");
////        action.click(page1.pay_type());
//        action.click(page1.shebao());
//        action.click(page1.order());
//        action.sleep(2);
//        action.click(page1.confrim());
//        action.DisplayElement(page1.pay());
//        action.getUrl();
//        action.successend();
//        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
//        Reporter.log(action.getUrl());
//    }

    /**
     * 阳光
     */
    public void YG_ZH_Plus() throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=194&is_gray=1&goods_code=G1583914102#/");
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(5);
        //选中保额
       // action.FindUitl(page1.yg30w());
      //  action.click(page1.yg30w());
        action.click(page1.order());
        action.type(page1.name(), "自动化");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
//        action.click(page1.pay_type());
        action.click(page1.order());
        action.sleep(2);
        action.click(page1.confrim());
        action.DisplayElement(page1.pay());
        action.getUrl();
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }

    public void YG_BW_Plus() throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=188&is_gray=1&goods_code=G1583894928");
        //默认保额固定
        action.pagefoload(10);
        action.sleep(5);
        action.click(page1.order());
        action.type(page1.name(), "自动化");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), m1);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
//        action.click(page1.pay_type());
        action.click(page1.order());
        action.sleep(2);
        //协议默认选中，直接跳转收银台了
        action.click(page1.confrim());
        action.DisplayElement(page1.pay());
        action.getUrl();
        //action.SnapshotForElement("res/images","taikang.png",page1.pay());
       action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("支付链接： "+action.getUrl());
    }


    //online 线上回归
    //全民医保2020 商城版用例模板
    public void SCTmp(String url) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(3);
        action.click(page1.order());
        action.type(page1.name(), "回归");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), "18230288372");
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.shebao());
        //action.click(page1.pay_type());
        action.click(page1.order());
        action.sleep(2);
        action.click(page1.confrim());
        action.sleep(2);
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(3);
        action.DisplayElement(page1.pay());
        action.getUrl();
        action.successend();
        Reporter.log("投保人信息：手机号：18230288372"+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }
    public void PHTmp(String url) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.lijilingqu());
        action.type(page1.name(), "回归");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), "18230288372");
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.shebao());
        //action.click(page1.pay_type());
        action.click(page1.order());
        action.sleep(2);
        action.click(page1.confrim());
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(3);
        action.DisplayElement(page1.pay());
        action.getUrl();
        action.successend();
        Reporter.log("投保人信息：手机号：18230288372"+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }

    //online  阳光线上回归
    public void yangguang(String url) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(5);
        //选中保额
        // action.FindUitl(page1.yg30w());
        //  action.click(page1.yg30w());
        action.click(page1.order());
        action.type(page1.name(), "回归");
        action.sleep(2);
        action.type(page1.idcard(), i1);
        action.sleep(2);
        String m2="15510664229";
        action.type(page1.mobile(), m2);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
//        action.click(page1.pay_type());
        action.click(page1.order());
        action.sleep(2);
        action.click(page1.confrim());
        action.sleep(3);
        action.DisplayElement(page1.pay());
        action.getUrl();
        action.successend();
        Reporter.log("投保人信息：手机号："+m2+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }
}
