package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.jiangxinAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SLN;
import static sun.baoxian.actions.mobileList.SXP;

public class jiangxinTest extends WebCaseBase {
    String url="https://bxmgray.ncfimg.com/#/long_insurancev2/detail?product_code=301912S0049";
    @Test
    public void jiangxin() throws Exception{
        jiangxinAction  action=new jiangxinAction();
        action.jiangxin_002(url,SLN);
    }
}
