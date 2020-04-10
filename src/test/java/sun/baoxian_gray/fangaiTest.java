package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.fangaiAction;
import sun.baoxian.base.WebCaseBase;

public class fangaiTest extends WebCaseBase {
    String month="https://bxmgray.ncfimg.com/web1/#/zhonghui_toufang/detail?product_code=101912S0022&tid=28";
    String year="https://bxmgray.ncfimg.com/web1/#/zhonghui_toufang/detail?product_code=101912S0022&tid=29";
    String zhonghe="https://bxmgray.ncfimg.com/web1/#/zhonghui_toufang/detail?product_code=101912S0022&tid=30";
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
