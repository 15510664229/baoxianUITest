package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class huatai extends WebCaseBase {
    String hautaiurl="https://bxm.ncfimg.com/biz/page/info?page_id=47&goods_code=G1584013312&channel=124&fr=670&product_code=P3020200023&__pl__=";
    //华泰
    @Test
    public void huataiTest () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(hautaiurl);
    }
}
