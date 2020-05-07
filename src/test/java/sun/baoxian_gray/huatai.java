package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.*;

public class huatai extends WebCaseBase {
    String taoqiurl="https://bxmgray.ncfimg.com/biz/page/info?page_id=62&goods_code=G1585192360&channel=124&fr=787&product_code=P3020200030&__pl__=";
    String zhuyuanrul="https://bxmgray.ncfimg.com/biz/page/info?page_id=61&goods_code=G1585190975&channel=124&fr=786&product_code=P1020200040&__pl__=";
    //华泰  360淘气保 -少儿意外
    @Test
    public void HUATAI_taoqibaoTest () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(taoqiurl,YYH);
    }
    @Test
    public void HUATAI_zhuyuanTest () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp(zhuyuanrul,SLN);
    }
}
