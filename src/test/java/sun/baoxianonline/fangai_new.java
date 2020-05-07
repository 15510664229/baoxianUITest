package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.actions.taikangAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class fangai_new extends WebCaseBase {
    /**
     * 防癌卫士商城版回归
     */
    String yiyuan="https://bxm.ncfimg.com/biz/page/info?page_id=38&goods_code=G1583331645";
    String sanyuan="https://bxm.ncfimg.com/biz/page/info?page_id=39&goods_code=G1583331691";
    String pinghua="https://bxm.ncfimg.com/biz/page/info?page_id=40&goods_code=G1583331721";
    @Test
    public void fangai_SC_1() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(yiyuan,SXP);
    }
    @Test
    public void fangai_SC_3() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(sanyuan,SXP);
    }
    @Test
    public void fangai_SC_PH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(pinghua,SXP);
    }
    /**
     * 防癌卫士投放版回归
     */
    String yiyuan2="https://bxm.ncfimg.com/biz/page/info?page_id=41&goods_code=G1583331645";
    String sanyuan2="https://bxm.ncfimg.com/biz/page/info?page_id=42&goods_code=G1583331691";
    String pinghua2="https://bxm.ncfimg.com/biz/page/info?page_id=43&goods_code=G1583331721";
    @Test
    public void fangai_TF_1() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(yiyuan2,SXP);
    }
    @Test
    public void fangai_TF_3() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(sanyuan2,SXP);
    }
    @Test
    public void fangai_TF_PH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(pinghua2,SXP);
    }

}
