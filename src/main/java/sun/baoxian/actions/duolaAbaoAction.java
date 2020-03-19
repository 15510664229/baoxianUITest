package sun.baoxian.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.duolaAbaopage;
import sun.baoxian.utils.SwipeScreenOrElement;
import sun.data.IdCardGenerator;
import sun.data.Mobile;

import java.util.ArrayList;
import java.util.List;

public class duolaAbaoAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    IdCardGenerator idCardGenerator = new IdCardGenerator();
    Mobile mobile=new Mobile();

    public void duolaAbao_001() throws Exception {
        duolaAbaopage page1 = new duolaAbaopage();
        page1.getPage("http://test.bxm.ncfimg.com/biz/page/info?page_id=105&is_gray=1&goods_code=G1581501768#/");
        //等待页面加载完成
        action.pagefoload(15);
        action.click(page1.submit());
        action.sleep(5);
        //弹层填写信息
//        action.click(page1.male());
        List<WebElement> w = new ArrayList<WebElement>();
        w = driver.findElements(By.className("am-list-extra"));
        w.get(0).click();
        //时间控件
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp1 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 200);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth1 = w.get(0).getText().replaceAll("/*-", "");
        w.get(1).click();
        list = driver.findElements(By.className("am-picker-col-mask"));
        SwipeScreenOrElement swp2 = new SwipeScreenOrElement(driver, list.get(0));
        swp1.swipe(list.get(0), 20, 30, 20, 150);
        action.sleep(2);
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        String birth2 = w.get(1).getText().replaceAll("/*-", "");
        action.click(page1.baoe20());
        action.click(page1.payY());
        action.click(page1.exzlerci());
        action.click(page1.tdjb());
        action.click(page1.submit());
        action.sleep(5);
        action.click(page1.jiangao());
        action.type(page1.ins_name(), "自动化");
        String m1=mobile.getTel();
        String i1=idCardGenerator.generate(birth1, "1");
        //String i2=idCardGenerator.generate(birth2, "1");
        String n1=mobile.getChineseName();
        action.type(page1.ins_idcard(),i1);
        action.click(page1.queding());
        action.type(page1.ins_mobile(), m1);
        action.type(page1.sms_code(), "111111");
        action.type(page1.email(), "226587@qq.com");
        action.type(page1.address(), "朝阳区不知道大街自动化小区琳琳街1410号");
        action.executeJS("window.scrollBy(0,400);");
        //身高
        action.click(page1.shengao());
        action.sleep(2);
        WebElement element2 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp3 = new SwipeScreenOrElement(driver, element2);
        for (int i = 0; i < 2; i++) {
            swp3.swipe(element2, 20, 50, 20, 80);
            action.sleep(1);
        }

        driver.findElement(By.xpath("//*[text()='确定']")).click();

        //体重
        action.click(page1.tizhong());
        action.sleep(2);
        WebElement element3 = driver.findElement(By.xpath("//*[@class='am-picker-col-mask']"));
        SwipeScreenOrElement swp4 = new SwipeScreenOrElement(driver, element3);
        for (int i = 0; i < 4; i++) {
            swp4.swipe(element3, 400, 50, 400, 92);
            action.sleep(1);
        }
        driver.findElement(By.xpath("//*[text()='确定']")).click();
        action.type(page1.bank_card(), "62170000121212222");
        action.type(page1.bank_mobile(), m1);
        action.click(page1.submit());
        action.DisplayElement(page1.deadline());
        action.successend();
        Reporter.log("投保人信息：手机号："+m1+"      "+"身份证号："+i1);
        Reporter.log("支付链接： "+action.getUrl());
    }
}