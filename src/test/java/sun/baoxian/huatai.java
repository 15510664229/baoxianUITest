package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class huatai extends WebCaseBase {
    String taoqiurl="http://test.bxm.ncfimg.com/biz/page/info?page_id=PC977331&is_gray=1&goods_code=G1585118141";
    String zhuyuanrul="http://test.bxm.ncfimg.com/biz/page/info?page_id=PC993411&is_gray=1&goods_code=G1584796297";
    //华泰  360淘气保 -少儿意外
    @Test
    public void HUATAI_taoqibaoTest () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(taoqiurl);
    }
    @Test
    public void HUATAI_zhuyuanTest () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(zhuyuanrul);
    }
}
