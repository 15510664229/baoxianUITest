package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class shortInsuranceTest  extends WebCaseBase {
    @Test
    public void taikang2020_SC_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yiyuanZH();
    }
    @Test
    public void taikang2020_SC_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yiyuanY();
    }
    @Test
    public void taikang2020_SC_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yiyuanM();
    }
    @Test
    public void taikang2020_PH_001() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.pinghuaY();
    }

    @Test
    public void zhonghui_001() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.zhonghui1();
    }
    @Test
    public void zhonghui_002() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.zhonghui3();
    }
    @Test
    public void zhonghui_003() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.zhonghuiPH();
    }
    @Test
    public void yangguang_ZHYW() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.YG_ZH_Plus();
    }
    @Test
    public void yangguang_BWYW() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.YG_BW_Plus();
    }
}
