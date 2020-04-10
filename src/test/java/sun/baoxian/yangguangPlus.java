package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class yangguangPlus extends WebCaseBase {
    //阳光plus
    String yangguangurl="http://test.bxm.ncfimg.com/biz/page/info?page_id=PC180325&is_gray=1&goods_code=G1583900229";

    @Test
    public void yangguangplus () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(yangguangurl);
    }
}
