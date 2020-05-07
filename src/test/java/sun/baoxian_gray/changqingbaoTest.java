package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.changqingbaoAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SLN;

public class changqingbaoTest extends WebCaseBase {
    String urlgray="https://bxmgray.ncfimg.com/#/long_insurancev2/detail?product_code=101912S0048";
    @Test
    public void changqingbaoA() throws Exception{
        changqingbaoAction action=new changqingbaoAction();
        action.changqingbao_002(urlgray,SLN);
    }
}
