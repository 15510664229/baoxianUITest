package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.changqingbaoAction;
import sun.baoxian.base.WebCaseBase;

public class changqingbaoTest extends WebCaseBase {
    String urlgray="https://bxmgray.ncfimg.com/#/long_insurancev2/detail?product_code=101912S0048";
    @Test
    public void changqingbaoA(String url) throws Exception{
        changqingbaoAction action=new changqingbaoAction();
        action.changqingbao_002(urlgray);
    }
}
