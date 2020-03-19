package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class yangguang_new  extends WebCaseBase {
    //阳光百万医疗线上回归
    String Month="http://bxm.ncfimg.com/biz/page/info?page_id=56&goods_code=G1584329159";
    String Year="http://bxm.ncfimg.com/biz/page/info?page_id=53&goods_code=G1584329184";
    String ZhongHe="http://bxm.ncfimg.com/biz/page/info?page_id=48&goods_code=G1583985163";


    @Test
    public void yangguang_BW_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Month);
    }
    @Test
    public void yangguang_BW_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Year);
    }
    @Test
    public void yangguang_BW_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(ZhongHe);
    }

    /**
     * 阳光综合意外线上回归
     */
    String Month2="http://bxm.ncfimg.com/biz/page/info?page_id=55&goods_code=G1584329000";
    String Year2="http://bxm.ncfimg.com/biz/page/info?page_id=54&goods_code=G1584329030";
    String ZhongHe2="http://bxm.ncfimg.com/biz/page/info?page_id=49&goods_code=G1583985162";

    @Test
    public void yangguang_ZH_M() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Month2);
    }
    @Test
    public void yangguang_ZH_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(Year2);
    }
    @Test
    public void yangguang_ZH_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.yangguang(ZhongHe2);
    }

}
