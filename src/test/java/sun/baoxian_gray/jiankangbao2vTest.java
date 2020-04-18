package sun.baoxian_gray;


import org.testng.annotations.Test;
import sun.baoxian.actions.jiankangbao2vAction;
import sun.baoxian.base.WebCaseBase;


public class jiankangbao2vTest extends WebCaseBase {
    String url="http://test.bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0061";
    String url1="https://bxmgray.ncfimg.com/#/long_insurance/detail?product_code=701911S0061";
    @Test
    public void jiankangbao3() throws Exception{
        jiankangbao2vAction action=new jiankangbao2vAction();
        action.jiankangbao_fox(url1);
    }
}
