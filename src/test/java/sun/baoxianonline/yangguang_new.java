package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SLN;
import static sun.baoxian.actions.mobileList.SXP;

public class yangguang_new  extends WebCaseBase {
    //阳光百万医疗线上回归
    String Month="http://bxm.ncfimg.com/biz/page/info?page_id=56&goods_code=G1584329159";
    String Year="http://bxm.ncfimg.com/biz/page/info?page_id=53&goods_code=G1584329184";
    String ZhongHe="http://bxm.ncfimg.com/biz/page/info?page_id=48&goods_code=G1583985163";


//    @Test
    public void yangguang_BW_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Month,SXP);
    }
//    @Test
    public void yangguang_BW_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Year,SXP);
    }
    @Test
    public void yangguang_BW_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(ZhongHe,SXP);
    }

    /**
     * 阳光综合意外线上回归
     */
    String Month2="http://bxm.ncfimg.com/biz/page/info?page_id=55&goods_code=G1584329000";
    String Year2="http://bxm.ncfimg.com/biz/page/info?page_id=54&goods_code=G1584329030";
    String ZhongHe2="http://bxm.ncfimg.com/biz/page/info?page_id=49&goods_code=G1583985162";

//    @Test
    public void yangguang_ZH_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Month2,SXP);
    }
//    @Test
    public void yangguang_ZH_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Year2,SXP);
    }
    @Test
    public void yangguang_ZH_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(ZhongHe2,SLN);
    }

    /**
    阳光千万保  20200602 yuyinhuan
     */
     //商城版

    String QWB_SC="https://h5.zkydib.com/biz/page/info?page_id=PAGE1589524376&is_gray=1&goods_code=G1589280169#/";

   @Test
    public void yangguang_QWB_SC() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(QWB_SC,SXP);
    }


}
