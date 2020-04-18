package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.jiangxinAction;
import sun.baoxian.actions.mamibaobeiAction;
import sun.baoxian.base.WebCaseBase;

public class mamibaobeiTest extends WebCaseBase {
    String url="http://test.bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0021";
    @Test
    public void mamibaobei() throws Exception{
        mamibaobeiAction action=new mamibaobeiAction();
        action.mamibaobei_fox(url);
    }
}
