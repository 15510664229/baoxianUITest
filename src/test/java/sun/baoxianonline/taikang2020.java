package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.actions.taikangAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class taikang2020 extends WebCaseBase {
    //泰康2020 一元版 商城版链接
    String Month="https://bxm.ncfimg.com/biz/page/info?page_id=14&goods_code=G1581745544";
    String Year="https://bxm.ncfimg.com/biz/page/info?page_id=12&goods_code=G1581747096";
    String ZhongHe="https://bxm.ncfimg.com/biz/page/info?page_id=10&goods_code=G1581517250";
    //泰康2020 平滑版  商城版链接
    String PH_M01="https://bxm.ncfimg.com/biz/page/info?page_id=11&goods_code=G1581517315";
    String PH_ZH01="https://bxm.ncfimg.com/biz/page/info?page_id=15&goods_code=G1581754461";
//    @Test
    public void taikang2020_SC_1_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(Month,SXP);
    }
//    @Test
    public void taikang2020_SC_1_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(Year,SXP);
    }
    @Test
    public void taikang2020_SC_1_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(ZhongHe,SXP);
    }
    @Test
    public void taikang2020_SC_PH_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(PH_ZH01,SXP);
    }
//    @Test
    public void taikang2020_SC_PH_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(PH_M01,SXP);
    }
    /**
     * 泰康2020 投放版链接
     */
    String Month2="https://bxm.ncfimg.com/biz/page/info?page_id=16&goods_code=G1581745544";
    String Year2="https://bxm.ncfimg.com/biz/page/info?page_id=20&goods_code=G1581747096";
    String ZhongHe2="https://bxm.ncfimg.com/biz/page/info?page_id=19&goods_code=G1581517250";
    //泰康2020 平滑版  商城版链接
    String PH_M02="https://bxm.ncfimg.com/biz/page/info?page_id=17&goods_code=G1581754461";
    String PH_ZH02="https://bxm.ncfimg.com/biz/page/info?page_id=18&goods_code=G1581517315";
//    @Test
    public void taikang2020_TF_1_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(Month2,SXP);
    }
//    @Test
    public void taikang2020_TF_1_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(Year2,SXP);
    }
    @Test
    public void taikang2020_TF_1_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(ZhongHe2,SXP);
    }
    @Test
    public void taikang2020_TF_PH_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(PH_ZH02,SXP);
    }
//    @Test
    public void taikang2020_TF_PH_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.PHTmp(PH_M02,SXP);
    }



    //泰康老人意外   yuyinhuan  20200515

    String LRYW_ZH01="https://bxm.ncfimg.com/biz/page/info?page_id=PAGE1588162655&is_gray=1&goods_code=G1588162418#/";
    @Test
    public void taikang_LRYW() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(LRYW_ZH01,SXP);
    }
}
