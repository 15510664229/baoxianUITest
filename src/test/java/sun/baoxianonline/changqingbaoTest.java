package sun.baoxianonline;

import org.testng.annotations.Test;
import org.testng.xml.SuiteXmlParser;
import sun.baoxian.actions.changqingbaoAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class changqingbaoTest extends WebCaseBase {
    String urlonline="https://bxm.ncfimg.com/#/long_insurancev2/detail?product_code=101912S0048";

    @Test
    public void changqingbaoA() throws Exception{
        changqingbaoAction action=new changqingbaoAction();
        action.changqingbao_002(urlonline, SXP);
    }
}
