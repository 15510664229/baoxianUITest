package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class studentChargeTest extends WebCaseBase {
    String StudentCharge="";
    //学平险收费版
    @Test
    public void studentCharge () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(StudentCharge);
    }
}
