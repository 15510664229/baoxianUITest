package sun.baoxian.actions.yuyuedan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.GoldenPage;
import sun.baoxian.pageObject.superMaPage;
import sun.baoxian.pageObject.yuyuedan.YGoldenPage;
import sun.baoxian.pageObject.yuyuedan.YsuperMaPage;
import sun.baoxian.pageObject.yuyuedan.homepage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.List;


public class GolenAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idcard=new IdCardGenerator();
    Mobile info=new Mobile();

    //超级玛丽牛保
    public void GoldenTest() throws  Exception {
        homepage page = new homepage();
        YGoldenPage page1 = new YGoldenPage();
        GoldenPage page2=new GoldenPage();
        Insure init = new Insure();
        Insure target = new Insure();
        //定义核保信息
        init.setInsName(info.getChineseName());
        init.setAplName(info.getChineseName());
        String aplmobile = (info.getTel()).toString();
        String insmoblie=(info.getTel()).toString();
        init.setInsMob(insmoblie);
        init.setAplMob(aplmobile);
        init.setBankCard("62121212121212100");
        init.setBankCode("中国银行");
//        init.setBankMob(aplmobile);
        init.setAplAdr((info.getRoad()).toString());
        init.setInsAdr((info.getRoad()).toString());
        init.setAplEmail((info.getEmail(5, 9)).toString());
        init.setInsEml((info.getEmail(4, 8)).toString());
        page.getPage("http://test.admin.dianxiao.ncfimg.com/DxParamData");
        //等待页面加载
        action.pagefoload(5);
        action.sleep(3);
        action.click(page.create());
        action.sleep(2);
        action.type(page.client_id2(), "18209876543");
        action.sleep(2);
        //定位下拉框

        action.selectByText(page.plat_goods_id(), "复兴黄金甲");
        action.click(page.save());
        action.sleep(8);
        //切换frame
        action.switchToFrame(page.product_frame());
        action.sleep(2);

        action.click(page1.book_next());
        //弹层信息修改
        action.sleep(5);
        //弹层信息修改
        //定位年龄信息，保存生日，生成身份证
        action.click(page1.apl_birth());
        action.sleep(2);
        birthswipe(3);
        action.click(page1.quding());
        action.sleep(3);
        String aplbirth=action.getText(page1.apl_birthcont()).replaceAll("/*-", "");
        init.setAplBrith(aplbirth);
        action.click(page1.apl_sex_F());
        action.sleep(3);
        //性别女
        String aplidcard=idcard.generate(aplbirth,"0");
        init.setAplCard(aplidcard);
        action.click(page1.ins_birth());
        action.sleep(2);
        birthswipe(6);
        action.click(page1.quding());
        action.sleep(4);
        String insbirth=action.getText(page1.ins_birthcont()).replaceAll("/*-", "");
        init.setInsBrith(insbirth);
        String insidcard=idcard.generate(insbirth,"1");
        init.setInsCard(insidcard);
        action.click(page1.ins_sex_M());
        action.sleep(4);
        action.click(page1.baoer20());
        action.sleep(3);
        action.click(page1.insurance_period_70A());
        //action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        action.click(page1.pay_70A());
        action.executeJS("window.scrollBy(0,400);");
//        action.sleep(2);
//        action.executeJS("window.scrollBy(0,400);");

        action.sleep(3);
        action.click(page1.die());
//        action.click(page1.shengji());
        action.sleep(3);
        String price1=action.getText(page1.price());
        init.setPrice1(price1);
        action.click(page1.book_next());
        //健康告知2次
        action.sleep(3);
        action.click(page1.jiangao());
//        action.sleep(2);
//        action.click(page1.jiangao());
        //进入第二页投保人、被保人详细信息填写页面
        //投保人信息填写
        action.sleep(3);
        action.clear(page1.aplname());
        action.type(page1.aplname(),init.getAplName());
        action.clear(page1.aplidcard());
        action.type(page1.aplidcard(),init.getAplCard());
        action.sleep(2);
        init.setAplCardPeriod(action.getText(page2.aplcardDate()));
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
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        action.click(page1.apl_job());
        action.sleep(3);
        jobswipe();
        action.sleep(2);
        String apljob=action.getText(page1.apl_job()).replaceAll("/*-", "");
        init.setAplJob(apljob);

        //身高体重我先不处理，不动


        //被保人信息填写 配偶
        action.click(page1.mate());
        action.sleep(3);
        action.type(page1.insname(),init.getInsName());
        action.type(page1.insidcard(),init.getInsCard());
        action.sleep(2);
        init.setInsCardPeriod(action.getText(page2.inscardDate()));
        action.type(page1.inseml(),init.getInsEml());
        action.type(page1.insmobile(),init.getInsMob());
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        action.click(page1.ins_city());
        action.sleep(2);
        cityswipe(2);
        action.click(page1.quding());
        action.sleep(2);
        String inscity=action.getText(page1.ins_citycont()).replaceAll("/*-", "");
        init.setInsCity(inscity);
        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        action.type(page1.insaddress(),init.getInsAdr());
        action.click(page1.ins_job());
        action.sleep(2);
        jobswipe();
        action.sleep(4);
        String insjob=action.getText(page1.ins_job()).replaceAll("/*-", "");
        init.setInsJob(insjob);
        //被保人的身高体重先不处理

        action.sleep(3);
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(2);
        //银行卡信息填写
        action.clear(page1.bankcard());
        action.type(page1.bankcard(),init.getBankCard());
        init.setPrice2(action.getText(page1.price2()));


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
        action.click(page2.insure());

        //弹框信息检查
        String aplbirtu=action.getText(page1.apl_birthcont()).replaceAll("/*-", "");
        target.setAplBrith(aplbirtu);
        String insbirtu=action.getText(page1.ins_birthcont()).replaceAll("/*-", "");
        target.setInsBrith(insbirtu);
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
        target.setAplCardPeriod(action.getText(page2.aplcardDate()));
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);



        //被保人信息
//        action.click(page2.insname());
        target.setInsName(action.getAttribute(page2.insname(),"value"));
        action.sleep(3);
        action.click(page2.insidcard());
        target.setInsCard(action.getAttribute(page2.insidcard(),"value"));
        action.sleep(2);
        target.setInsCardPeriod(action.getText(page2.inscardDate()));
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);
        action.click(page2.insmobile());
        target.setInsMob(action.getAttribute(page2.insmobile(),"value"));
        target.setInsCity(action.getText(page2.ins_citycont()).replaceAll("/*-", ""));
        target.setInsAdr(action.getText(page2.insaddress()));
        target.setInsEml(action.getAttribute(page2.inseml(),"value"));
        target.setInsJob(action.getText(page2.ins_job()).replaceAll("/*-", ""));
        action.executeJS("window.scrollBy(0,400);");
        action.sleep(3);

        target.setBankCard(action.getAttribute(page2.bankcard(),"value"));
        target.setBankCode(action.getText(page1.bankcode()));
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
            ta.moveToElement(el2).clickAndHold().moveByOffset(0, -100).release().build().perform();
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
