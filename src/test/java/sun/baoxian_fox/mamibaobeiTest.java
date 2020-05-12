package sun.baoxian_fox;

import org.testng.annotations.Test;
import sun.baoxian.actions.mamibaobeiAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;
import static sun.baoxian.actions.mobileList.YYH;

public class mamibaobeiTest extends WebCaseBase {
    String url="http://test.bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0021";
    String url1="https://bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0021";
    String urlFac="https://bxm.ncfimg.com/biz/page/info?page_id=maba&goods_code=G1582364571#/";
    @Test
    public void mamibaobei() throws Exception{
        mamibaobeiAction action=new mamibaobeiAction();
        action.mamibaobei_fox(url1,YYH);

    }
    @Test
    public void mamibaobei_Fac() throws Exception{
        mamibaobeiAction action=new mamibaobeiAction();
        action.mamibaobei_fox(urlFac,SXP);
    }
}
