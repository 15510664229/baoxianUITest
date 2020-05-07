package sun.baoxian_fox;


import org.testng.annotations.Test;
import sun.baoxian.actions.jiankangbao2vAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.YYH;


public class jiankangbao2vTest extends WebCaseBase {
    String url1="https://bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0061";
    @Test
    public void jiankangbao3() throws Exception{
        jiankangbao2vAction action=new jiankangbao2vAction();
        action.jiankangbao_fox(url1,YYH);
    }
}
