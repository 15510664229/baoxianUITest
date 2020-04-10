package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class studentChargeTest extends WebCaseBase {
    String StudentCharge="https://bxm.ncfimg.com/biz/page/info?page_id=64&goods_code=G1585382093&channel=124&fr=784&product_code=P3020200037&__pl__=";
    //学平险收费版
    @Test
    public void studentCharge () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(StudentCharge);
    }
}
