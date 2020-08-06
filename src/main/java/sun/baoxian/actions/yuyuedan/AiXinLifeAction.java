package sun.baoxian.actions.yuyuedan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.AiXinChildPage;
import sun.baoxian.pageObject.AiXinLifePage;
import sun.baoxian.pageObject.yuyuedan.YAiXinChildPage;
import sun.baoxian.pageObject.yuyuedan.YAiXinLifePage;
import sun.baoxian.pageObject.yuyuedan.homepage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.List;


public class AiXinLifeAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idcard=new IdCardGenerator();
    Mobile info=new Mobile();

    //超级玛丽牛保
    public void aixinliftTest() throws  Exception {
        homepage page = new homepage();
        YAiXinLifePage page1 = new YAiXinLifePage();
        AiXinLifePage page2=new AiXinLifePage();
        Insure init = new Insure();
        Insure target = new Insure();
        //定义核保信息
//        init.setInsName(info.getChineseName());
        init.setAplName(info.getChineseName());
        String aplmobile = (info.getTel()).toString();
        init.setAplMob(aplmobile);
        init.setBankCard("62121212121212100");
        init.setBankCode("中国银行");
        init.setBankMob(aplmobile);
        init.setAplAdr((info.getRoad()).toString());
        init.setAplEmail((info.getEmail(5, 9)).toString());
        init.setAplCard(idcard.generate("19941210","0"));
//        init.setInsCard(idcard.generate("19941210","0"));
        page.getPage("http://test.admin.dianxiao.ncfimg.com/DxParamData");
        //等待页面加载
        action.pagefoload(5);
        action.sleep(3);
        action.click(page.create());
        action.sleep(2);
        action.type(page.client_id2(), "18209876543");
        action.sleep(2);
        //定位下拉框

        action.selectByText(page.plat_goods_id(), "爱心人寿");
        action.click(page.save());
        action.sleep(8);
        //切换frame
        action.switchToFrame(page.product_frame());
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        action.type(page1.insage(),"25");
        action.sleep(2);
        action.click(page1.male());
        action.click(page1.pay_type_Y());
        action.sleep(4);
       action.click(page1.add());
        action.sleep(2);
        action.click(page1.add());
        action.sleep(2);
        action.click(page1.pay_period10());
        action.sleep(2);
        String price1=action.getText(page1.price());
        init.setPrice1(price1);
        action.click(page1.book_next());
        //健康告知
        action.sleep(3);
        action.click(page1.jiangao());

        //投保人信息填写
        action.sleep(3);
        action.clear(page1.aplname());
        action.type(page1.aplname(),init.getAplName());
        action.clear(page1.aplidcard());
        action.type(page1.aplidcard(),init.getAplCard());
        action.sleep(2);
        action.clear(page1.aplmobile());
        action.type(page1.aplmobile(),init.getAplMob());
        action.type(page1.apleml(),init.getAplEmail());
        action.type(page1.apladdress(),init.getAplAdr());
        action.sleep(2);
        action.click(page1.apl_city());
        action.sleep(2);
        cityswipe(2);
        action.click(page1.quding());
        action.sleep(3);
        String aplcity=action.getText(page1.apl_citycont()).replaceAll("/*-", "");
        init.setAplCity(aplcity);
       action.sleep(3);
        action.click(page1.apl_job());
        action.sleep(2);
        jobswipe();
        action.sleep(2);
        String apljob=action.getText(page1.apl_job()).replaceAll("/*-", "");
        init.setAplJob(apljob);

        //被保人信息 本人
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);

        action.clear(page1.bankcard());
        action.type(page1.bankcard(),init.getBankCard());
        action.sleep(2);
        action.clear(page1.bankmobile());
        action.type(page1.bankmobile(),init.getBankMob());
        init.setPrice2(action.getText(page1.price2()));
        action.sleep(5);


        //点击保存
        action.click(page1.save_final());
        action.sleep(2);
        action.click(page1.protocol_but());
        action.sleep(2);
        //保存成功！
        boolean savesuss=true;
//        action.sleep(7);
        if(action.isElementsPresent(page.save_success(),20)){
            action.successend();//捕捉截图
            Reporter.log("捕捉到 保存成功toast了 "+savesuss);
        }else {
            savesuss=false;
            Reporter.log("没有捕捉到 保存成功toast "+savesuss);
        }

        //默认保存成功---刷新浏览器获取用户url
        driver.navigate().refresh();
        action.sleep(3);
        //页面刷新后搜索框输入关键字筛选定位第一条数据
        action.type(page.client_id(),"18209876543");
        action.click(page.search());
        action.sleep(2);
        //定位第一条数据
        String user_url= action.getText(page.user_url());
        page.getPage(user_url);
        action.sleep(5);
        //打开页面  用户url信息收集

        String price1u=action.getText(page1.price());
        target.setPrice1(price1u);
        action.click(page2.insure());
        action.sleep(2);
        action.click(page1.jiangao());
        action.sleep(4);
       // action.click(page1.jiangao());
      //  action.sleep(3);
        //进入产品页面，详细信息填写
        if ( action.isElementsPresent(page2.ver(),5)){
            action.type(page2.ver(),"111111");
            action.sleep(3);
        }

        //信息填写页面信息校验的内容有   投保人姓名+身份证号+手机号+邮箱+城市+职业类型+详细地址+银行卡号+银行code+银行预留手机号+试算金额
//        action.click(page1.aplname());
        target.setAplName(action.getAttribute(page2.aplname(),"value"));
        action.click(page2.aplidcard());
        target.setAplCard(action.getAttribute(page2.aplidcard(),"value"));
        action.click(page2.aplmobile());
        target.setAplMob(action.getAttribute(page2.aplmobile(),"value"));
        target.setAplCity(action.getText(page2.apl_citycont()).replaceAll("/*-", ""));
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        target.setAplAdr(action.getText(page2.apladdress()));
        target.setAplEmail(action.getAttribute(page2.apleml(),"value"));
        target.setAplJob(action.getText(page1.apl_job()).replaceAll("/*-", ""));
//        target.setAplCardPeriod(action.getText(page2.aplcardDate()));



        //被保人信息

        target.setBankCard(action.getAttribute(page2.bankcard(),"value"));
        target.setBankCode(action.getText(page1.bankcode()));
        action.sleep(2);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        action.click(page2.bankmobile());
        action.sleep(1);
        target.setBankMob(action.getAttribute(page2.bankmobile(),"value"));
        target.setPrice2(action.getText(page1.price2()));
        action.sleep(2);


        action.click(page2.insure());
        action.sleep(3);
        action.click(page1.protocol_but());
        action.sleep(3);
        Insure init1= init.checkNull(init);
        Insure target1=target.checkNull(target);
        boolean check=true;
        if (init1.equals(target1)){
            Reporter.log("下发的信息正确"+check);
        }else {
            check=false;
            Reporter.log("下发的信息不匹配，请核对字段"+check);
        }
        //跳转收银台是否成功
        boolean paysucc=true;
        if ( action.isElementsPresent(page2.success(),20) ){
            action.successend();
            Reporter.log("跳转收银台成功  ");
        }else {
            paysucc=false;
            Reporter.log("跳转收银台失败  ");
        }

        Reporter.log("预约单填写的信息为 ： "+init.toString());
        Reporter.log("用户链接下发的信息为 ： "+target.toString());
        Reporter.log("用户链接为 ： "+user_url);
        //保存成功toast 不好捕捉
        if (!(check&paysucc)){
            Assert.fail("有失败，请查看详细日志信息");
        }

    }
    public void  birthswipe(int sum){
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        for (int i=0;i<sum;i++) {
            swp1.swipe(list.get(0), 20, 30, 20, 100);
            action.sleep(1);
        }
        action.sleep(2);

    }
    public void  jobswipe(){
        WebElement el2 = driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']"));
        Actions ta=new Actions(driver);
        ta.release();
        for (int i=0;i<3;i++) {
            ta.moveToElement(el2).clickAndHold().moveByOffset(0, -150).release().build().perform();
            action.sleep(2);
            driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
            action.sleep(4);
        }
    }
    public void  cityswipe(int sum){
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp = new SwipeScreenOrElement(driver, list.get(0));
        for (int i=0;i<2;i++) {
            swp.swipe(list.get(0), 20, 30, 20, -30);
            action.sleep(1);
        }
        action.sleep(2);

    }


}
