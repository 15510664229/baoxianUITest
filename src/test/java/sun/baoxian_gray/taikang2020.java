package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SLN;

public class taikang2020 extends WebCaseBase {
    //泰康2020 一元版 商城版链接
    String Month="https://bxmgray.ncfimg.com/biz/page/info?page_id=14&goods_code=G1581745544";
    String Year="https://bxmgray.ncfimg.com/biz/page/info?page_id=12&goods_code=G1581747096";
    String ZhongHe="https://bxmgray.ncfimg.com/biz/page/info?page_id=10&goods_code=G1581517250";
    //泰康2020 平滑版  商城版链接
    String PH_M01="https://bxmgray.ncfimg.com/biz/page/info?page_id=11&goods_code=G1581517315";
    String PH_ZH01="https://bxmgray.ncfimg.com/biz/page/info?page_id=15&goods_code=G1581754461";
    @Test
    public void taikang2020_SC_1_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(Month,SLN);
    }
    @Test
    public void taikang2020_SC_1_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(Year,SLN);
    }
    @Test
    public void taikang2020_SC_1_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(ZhongHe,SLN);
    }
    @Test
    public void taikang2020_SC_PH_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(PH_ZH01,SLN);
    }
    @Test
    public void taikang2020_SC_PH_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(PH_M01,SLN);
    }
    /**
     * 泰康2020 投放版链接
     */
    String Month2="https://bxmgray.ncfimg.com/biz/page/info?page_id=16&goods_code=G1581745544";
    String Year2="https://bxmgray.ncfimg.com/biz/page/info?page_id=20&goods_code=G1581747096";
    String ZhongHe2="https://bxmgray.ncfimg.com/biz/page/info?page_id=19&goods_code=G1581517250";
    //泰康2020 平滑版  商城版链接
    String PH_M02="https://bxmgray.ncfimg.com/biz/page/info?page_id=17&goods_code=G1581754461";
    String PH_ZH02="https://bxmgray.ncfimg.com/biz/page/info?page_id=18&goods_code=G1581517315";
    @Test
    public void taikang2020_TF_1_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(Month2,SLN);
    }
    @Test
    public void taikang2020_TF_1_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(Year2,SLN);
    }
    @Test
    public void taikang2020_TF_1_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(ZhongHe2,SLN);
    }
    @Test
    public void taikang2020_TF_PH_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(PH_ZH02,SLN);
    }
    @Test
    public void taikang2020_TF_PH_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(PH_M02,SLN);
    }

}
