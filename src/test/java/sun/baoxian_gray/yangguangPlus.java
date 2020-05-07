package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SLN;
import static sun.baoxian.actions.mobileList.SXP;

public class yangguangPlus extends WebCaseBase {
    //阳光plus
    String yangguangurl="https://bxmgray.ncfimg.com/biz/page/info?page_id=47&goods_code=G1584013312&channel=124&fr=670&product_code=P3020200023&__pl__=";

    @Test
    public void yangguangplus () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.SCTmp_idcard(yangguangurl,"150404199312100264",SXP);
//        action.SCTmp(yangguangurl);
    }
}
