package sun.baoxian.actions;

import org.bytedeco.javacpp.presets.opencv_core;
import org.testng.Assert;
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
        if (action.isElementsPresent(page1.pay(),10)){
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        //action.DisplayElement(page1.pay());
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
    }



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
        if (action.isElementsPresent(page1.pay(),10)){
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
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
        if (action.isElementsPresent(page1.pay(),10)){
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
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
        if (action.isElementsPresent(page1.pay(),10)){
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("支付链接： "+action.getUrl());
    }


    //online 线上回归
    //全民医保2020 商城版用例模板
    public void SCTmp(String url,String mobile) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(3);
        action.click(page1.order());
        action.type(page1.name(), "回归");
        action.sleep(1);
        action.type(page1.idcard(), i1);
        action.type(page1.mobile(), mobile);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
       // action.click(page1.shebao());
        //action.click(page1.pay_type());
        action.click(page1.order());
        action.isElementsPresent(page1.confrim(),10);
        action.click(page1.confrim());
        action.sleep(2);
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(3);
        if (action.isElementsPresent(page1.pay(),10)){
            action.getUrl();
            action.successend();
        }else  {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");

        }
        Reporter.log("投保人信息：手机号："+mobile+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
        Reporter.log("回归链接地址： "+url);
        //action.DisplayElement(page1.pay());

    }

    /**
     * 风控指定idcard
     * @param url
     * @throws Exception
     */


    public void SCTmp_idcard(String url,String idcard,String mobile) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(3);
        action.click(page1.order());
        action.type(page1.name(), "孙雪萍");
        action.sleep(1);
        action.type(page1.idcard(), idcard);
        action.type(page1.mobile(), mobile);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        // action.click(page1.shebao());
        //action.click(page1.pay_type());
        action.click(page1.order());
        action.isElementsPresent(page1.confrim(),10);
        action.click(page1.confrim());
        action.sleep(2);
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(3);
        if (action.isElementsPresent(page1.pay(),10)) {
        action.DisplayElement(page1.pay());
        action.getUrl();
        action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+mobile+"      "+"身份证号："+idcard);
        Reporter.log(action.getUrl());
    }


    public void PHTmp(String url,String mobile) throws Exception {
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
        action.type(page1.mobile(), mobile);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.shebao());
        //action.click(page1.pay_type());
        action.click(page1.order());
        action.isElementsPresent(page1.confrim(),10);
        action.click(page1.confrim());
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(3);
        if (action.isElementsPresent(page1.pay(),10)){
            //action.DisplayElement(page1.pay());
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }

        Reporter.log("投保人信息：手机号："+mobile+"      "+"身份证号："+i1);
        Reporter.log(action.getUrl());
        Reporter.log("回归链接地址： "+url);
    }

    //online  阳光线上回归
    public void yangguang(String url,String mobile) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(5);
        //选中保额
        // action.FindUitl(page1.yg30w());
        //  action.click(page1.yg30w());
        action.click(page1.order());
        action.type(page1.name(), "孙雪萍");
        action.sleep(2);
        //String i="150404199312100264";
        String i="513436196005164505";

        action.type(page1.idcard(), i);
        action.sleep(2);
        action.type(page1.mobile(), mobile);
        action.type(page1.sms_code(), "111111");
        //滑动页面使元素可见
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
//        action.click(page1.pay_type());
        action.click(page1.order());
        action.isElementsPresent(page1.confrim(),10);
        action.click(page1.confrim());
        action.sleep(3);
        if (action.isElementsPresent(page1.pay(),10)){
            action.getUrl();
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+mobile+"      "+"身份证号："+i);
        Reporter.log(action.getUrl());
        Reporter.log("回归链接地址： "+url);
    }

    //学平险&（阳光综合意外plus版本）收费版回归 online
    public void StudentTmp(String url,String mobile) throws Exception {
        shortTmp page1 = new shortTmp();
        page1.getPage(url);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(5);
        action.click(page1.order());
        action.type(page1.apl_name(), "孙雪萍");
        action.sleep(1);
        String i="150404199312100264";
        action.type(page1.apl_identity(),i);
        action.sleep(2);
        //action.type(page1.mobile(),"15510664229");
        action.type(page1.mobile(),mobile);
        action.sleep(2);
        action.type(page1.sms_code(), "111111");
        //被保人关系为子女
        //滑动页面使元素可见
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.type(page1.ins_name(),"测试");
        action.type(page1.ins_identity(),idCardGenerator.generate("20100101","0"));
        action.sleep(3);
        action.click(page1.order());
        action.isElementsPresent(page1.confrim(),10);
        action.click(page1.confrim());
        if (action.isElementsPresent(page1.jiangao(),5)){
            action.click(page1.jiangao());
        }
        action.sleep(2);

        if (action.isElementsPresent(page1.pay(),10)){
            //action.DisplayElement(page1.pay());
            action.getUrl();
            //action.SnapshotForElement("res/images/", "taikang.png", page1.pay());
            action.successend();
        }else {
            action.click(page1.order());
            action.sleep(1);
            action.fail();
            action.fail();
            Assert.fail("核保失败-跳转收银台失败");
        }
        Reporter.log("投保人信息：手机号："+mobile+"      "+"身份证号："+i);
        Reporter.log(action.getUrl());
        Reporter.log("回归链接地址： "+url);
    }




}
