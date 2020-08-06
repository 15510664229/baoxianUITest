package sun.baoxian.actions.yuyuedan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.iBaoCpage;
import sun.baoxian.pageObject.yuyuedan.homepage;
import sun.baoxian.pageObject.yuyuedan.iBaoC2page;
import sun.baoxian.pageObject.yuyuedan.loginpage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.List;


public class ibaokeAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idcard=new IdCardGenerator();
    Mobile info=new Mobile();
    //阳光意外两全i保客
    public void ibaoKeTest() throws  Exception{
        loginpage page=new loginpage();
        homepage page1=new homepage();
        iBaoC2page page3=new  iBaoC2page();
        iBaoCpage page4=new iBaoCpage();

        Insure init=new Insure();
        Insure target=new Insure();
        //定义核保信息
        init.setAplName(info.getChineseName());
        init.setAplCard(idcard.generate("19931210","1"));
        String mobile=(info.getTel()).toString();
        init.setAplMob(mobile);
        init.setBankCard("62121212121212100");
        init.setBankCode("中国银行");
        init.setBankMob(mobile);
        init.setAplAdr((info.getRoad()).toString());
//        init.setAplEmail((info.getEmail(5,9)).toString());
        page.getPage("http://test.admin.dianxiao.ncfimg.com/DxParamData");
        //等待页面加载
        action.pagefoload(5);
        action.sleep(3);
        action.click(page1.create());
        action.sleep(2);
        action.type(page1.client_id2(), "18209876543");
        action.sleep(2);
        //定位下拉框

        action.selectByText(page1.plat_goods_id(),"阳光意外两全i保客");
        action.click(page1.save());
        action.sleep(8);
        //切换frame
        action.switchToFrame(page3.product_frame());
        action.sleep(2);
//        driver.switchTo().frame("ifm");
        action.click(page3.save_next());
        //弹层信息修改
        action.sleep(5);
        //弹层信息修改
        action.click(page3.birth());
        //点击生日，滑动生日控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        for (int i=0;i<3;i++) {
            swp1.swipe(list.get(0), 20, 30, 20, 100);
            action.sleep(1);
        }
        action.sleep(2);
        action.click(page3.quding());
        init.setInsBrith(action.getText(page3.birthcont()).replaceAll("/*-", ""));
        action.sleep(2);
        //缴费年限切换10年
        action.click(page3.pay_10Y());
        //缴费方式切换年缴
        action.click(page3.pay_type_Y());
        //保额15万
        action.click(page3.baoer15());
        action.sleep(3);
        init.setPrice1(action.getText(page3.price()));
        action.click(page3.save_next());
        action.sleep(3);
        //健康告知
        action.click(page3.jiangao());
        //产品页
        action.sleep(8);
        action.clear(page3.aplname());
        action.type(page3.aplname(),init.getAplName());
        action.clear(page3.aplidcard());
        action.type(page3.aplidcard(),init.getAplCard());
        action.clear(page3.aplmobile());
        action.type(page3.aplmobile(),init.getAplMob());
//        action.type(page3.apleml(),init.getAplEmail());
        //职业选择
        action.sleep(5);
        action.click(page3.job());
        action.sleep(2);
        WebElement el2 = driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']"));
        Actions ta=new Actions(driver);
        ta.release();
        for (int i=0;i<4;i++) {
            ta.moveToElement(el2).clickAndHold().moveByOffset(0, -150).release().build().perform();
            action.sleep(2);
            driver.findElement(By.xpath("//*[@class='am-picker-col-indicator ']")).click();
            action.sleep(4);
        }
        init.setAplJob(action.getText(page3.job()).replaceAll("/*-", ""));
        action.type(page3.apladdress(),init.getAplAdr());
        //滑动页面定位到银行卡填写页面
        action.executeJS("window.scrollBy(0,400);");

        //身高体重不取默认值
        action.click(page4.height());
        action.sleep(2);
        WebElement element2 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp3 = new SwipeScreenOrElement(driver, element2);
        for (int i = 0; i < 2; i++) {
            swp3.swipe(element2, 20, 50, 20, 80);
            action.sleep(1);
        }
        action.click(page4.quding());
        action.sleep(1);
        //体重
        action.click(page4.weight());
        action.sleep(3);
        WebElement element3 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp4 = new SwipeScreenOrElement(driver, element3);
        for (int i = 0; i < 2; i++) {
            swp4.swipe(element3, 20, 50, 20, 80);
            action.sleep(1);
        }
        action.click(page4.quding());
        action.sleep(1);
        action.clear(page3.bankcard());
        action.type(page3.bankcard(),init.getBankCard());
        action.clear(page3.bankmobile());
        action.type(page3.bankmobile(),init.getBankMob());
        init.setPrice2(action.getText(page3.price2()));
        action.sleep(2);
        action.click(page3.save_final());
        action.sleep(2);
        //弹窗继续
        action.click(page3.protocol_but());
        //保存成功！
        boolean savesuss=true;
//        action.sleep(7);
        if(action.isElementsPresent(page1.save_success(),20)){
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
        action.type(page3.client_id(),"18209876543");
        action.click(page1.search());
        action.sleep(2);
        //定位第一条数据
        String user_url= action.getText(page1.user_url());
        page.getPage(user_url);
        action.sleep(5);
        //打开页面
        action.click(page4.insure());
        action.sleep(2);
        target.setPrice1(action.getText(page4.price()));
        target.setInsBrith(action.getText(page4.birthcont()).replaceAll("/*-", ""));
        //再次点击核保进入健告
        action.click(page4.insure());
        action.sleep(2);
        action.click(page4.jiangao());
        //等待页面加载
        action.sleep(3);
        if ( action.isElementsPresent(page4.ver(),5)){
            action.type(page4.ver(),"111111");
            action.sleep(3);
        }
        //信息填写页面信息校验的内容有   投保人姓名+身份证号+手机号+邮箱+城市+职业类型+详细地址+银行卡号+银行code+银行预留手机号+试算金额
        action.click(page4.aplname());
        target.setAplName(action.getAttribute(page4.aplname(),"value"));
        action.click(page4.aplidcard());
        target.setAplCard(action.getAttribute(page4.aplidcard(),"value"));
        action.click(page4.aplmobile());
        target.setAplMob(action.getAttribute(page4.aplmobile(),"value"));
        target.setBankCard(action.getAttribute(page4.bankcard(),"value"));
        target.setAplAdr(action.getText(page4.apladdress()));
        action.click(page4.bankmobile());
        target.setBankMob(action.getAttribute(page4.bankmobile(),"value"));
//        target.setAplEmail(action.getAttribute(page4.apleml(),"value"));
        target.setPrice2(action.getText(page4.price2()));
        target.setAplJob(action.getText(page4.job()).replaceAll("/*-", ""));
        target.setBankCode(action.getText(page4.code()));

        action.click(page4.insure());
        action.sleep(3);
        action.click(page4.protocol_but());
        action.sleep(15);
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
        if ( action.isElementsPresent(page4.success(),20) ){
            action.successend();
            Reporter.log("跳转收银台成功  ");
        }else {
            paysucc=false;
            Reporter.log("跳转收银台失败  ");
        }

        Reporter.log("预约单填写的信息为 ： "+init.toString());
        Reporter.log("用户链接下发的信息为 ： "+target.toString());
        Reporter.log("用户链接为 ： "+user_url);
        if (!(check&paysucc)){
            Assert.fail("有失败，请查看详细日志信息");
        }

    }

}
