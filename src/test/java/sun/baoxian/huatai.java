package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class huatai extends WebCaseBase {
    String huataiurl="http://test.bxm.ncfimg.com/biz/page/info?page_id=223&is_gray=1&goods_code=G1584796297#/";
    //华泰
    @Test
    public void huataiTest () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(huataiurl);
    }
}
