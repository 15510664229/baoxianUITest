package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.jiankangbao2vAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class jiankangbao2vTest extends WebCaseBase {
    String url="https://bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0061";
    @Test
    public void jiankangbao() throws Exception{
        jiankangbao2vAction action=new jiankangbao2vAction();
        action.jiankangbao_fox(url,SXP);
    }
}
