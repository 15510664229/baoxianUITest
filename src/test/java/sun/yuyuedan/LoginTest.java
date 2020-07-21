package sun.yuyuedan;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.baoxian.actions.yuyuedan.*;
import sun.baoxian.base.WebCaseBase;

public class LoginTest extends WebCaseBase {
    String url="http://test.admin.dianxiao.ncfimg.com/";
    LoginAction action=new LoginAction();
    @BeforeTest
    public void Login() throws Exception{
        action.login(url);
    }
    @Test
    public void ibao2Test() throws Exception {
        ibaoCAction action=new ibaoCAction();
        action.ibaoC2Test();
    }
    @Test
    public void ibao3Test() throws Exception {
        ibaoCAction action=new ibaoCAction();
        action.ibaoC3Test();
    }
    @Test
    public void superMarieTest() throws Exception {
        YSuperMaAction action=new YSuperMaAction();
        action.supermarieTest();
    }

    @Test
    public  void  AiXinLife() throws Exception{
        AiXinLifeAction action=new AiXinLifeAction();
        action.aixinliftTest();
    }
    @Test
    public  void  AiXinChild() throws Exception{
        AiXinChildAction action=new AiXinChildAction();
        action.aixinChildTest();
    }
    @Test
    public  void  Golden() throws Exception{
        GolenAction action=new GolenAction();
        action.GoldenTest();
    }

}
