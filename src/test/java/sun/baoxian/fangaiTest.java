package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.fangaiAction;
import sun.baoxian.actions.jiangxinAction;
import sun.baoxian.base.WebCaseBase;

public class fangaiTest extends WebCaseBase {
    @Test
    public void fangai() throws Exception{
        fangaiAction action=new fangaiAction();
        action.fangai_001();
    }

}
