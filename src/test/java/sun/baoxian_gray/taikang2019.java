package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.taikangAction;
import sun.baoxian.base.WebCaseBase;

public class taikang2019 extends WebCaseBase {
    String Month="https://bxmgray.ncfimg.com/#/detail_external?product_code=101911S0035&tid=7";
    String Year="https://bxmgray.ncfimg.com/#/detail_external?product_code=101911S0035&tid=6";
    String ZhongHe="https://bxmgray.ncfimg.com/#/detail_external?product_code=101911S0035&tid=8";
    @Test
    public void taikang2019_M() throws Exception{
        taikangAction action=new taikangAction();
        action.taikang2019(Month);
    }
    @Test
    public void taikang2019_Y() throws Exception{
        taikangAction action=new taikangAction();
        action.taikang2019(Year);
    }
    @Test
    public void taikang2019_ZH() throws Exception{
        taikangAction action=new taikangAction();
        action.taikang2019(ZhongHe);
    }
}
