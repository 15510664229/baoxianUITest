package sun.baoxianonline;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.testng.annotations.Test;
import sun.baoxian.actions.taikangAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class taikang2019 extends WebCaseBase {
    String Month="https://bxm.ncfimg.com/#/detail_external?product_code=101911S0035&tid=7";
    String Year="https://bxm.ncfimg.com/#/detail_external?product_code=101911S0035&tid=6";
    String ZhongHe="https://bxm.ncfimg.com/#/detail_external?product_code=101911S0035&tid=8";
    @Test
    public void taikang2019_M() throws Exception{
        taikangAction action=new taikangAction();
        action.taikang2019(Month, SXP);
    }
    @Test
    public void taikang2019_Y() throws Exception{
        taikangAction action=new taikangAction();
        action.taikang2019(Year,SXP);
    }
    @Test
    public void taikang2019_ZH() throws Exception{
        taikangAction action=new taikangAction();
        action.taikang2019(ZhongHe,SXP);
    }

}
