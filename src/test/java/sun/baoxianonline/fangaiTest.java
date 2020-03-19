package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.fangaiAction;
import sun.baoxian.base.WebCaseBase;

public class fangaiTest extends WebCaseBase {
    String month="http://test.bxm.ncfimg.com/web1/#/zhonghui_toufang/detail?product_code=101912S0022&tid=30";
    String year="http://test.bxm.ncfimg.com/web1/#/zhonghui_toufang/detail?product_code=101912S0022&tid=29";
    String zhonghe="http://test.bxm.ncfimg.com/web1/#/zhonghui_toufang/detail?product_code=101912S0022&tid=28";
    @Test
    public void fangai_M() throws Exception{
        fangaiAction action=new fangaiAction();
        action.fangai_002(month);
    }
    @Test
    public void fangai_Y() throws Exception{
        fangaiAction action=new fangaiAction();
        action.fangai_002(year);
    }
    @Test
    public void fangai_ZH() throws Exception{
        fangaiAction action=new fangaiAction();
        action.fangai_002(zhonghe);
    }

}
