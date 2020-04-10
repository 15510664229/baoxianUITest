package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class studentChargeTest extends WebCaseBase {
    String StudentCharge="http://test.bxm.ncfimg.com/biz/page/info?page_id=PC755805&is_gray=1&goods_code=G1585191131";
    //学平险收费版
    @Test
    public void studentCharge () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(StudentCharge);
    }
}
