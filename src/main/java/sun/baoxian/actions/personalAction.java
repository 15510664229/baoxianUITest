package sun.baoxian.actions;

import sun.baoxian.base.WebCaseBase;
import sun.baoxian.base.WebElementBase;
import sun.baoxian.pageObject.personalpage;
import java.io.IOException;

public class personalAction extends WebCaseBase {
    WebElementBase action = new WebElementBase();
    public void tuibao() throws IOException {
        String tuibaoOnline="https://bxm.ncfimg.com/#/user/manageview";
        String baodanOnline="https://bxm.ncfimg.com/user/index/#/manage/detail?btoken=aafaaa08b233ab84bb5fd0f3a39d2bd2";
        personalpage page1=new personalpage();
        //先登录
        page1.getPage(tuibaoOnline);
        //等待页面加载完成
        action.pagefoload(10);
        action.sleep(3);
        action.type(page1.mobile(),"18230288372");
        action.type(page1.sms(),"111111");
        action.sleep(2);
        action.click(page1.submit());
        action.DisplayElement(page1.yiliaobaoxian());
        page1.getPage(baodanOnline);
        action.executeJS("window.scrollBy(0,400);");
        action.click(page1.tuibao());
        action.sleep(5);
    }
}
