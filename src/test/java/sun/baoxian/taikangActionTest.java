package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.taikangAction;
import sun.baoxian.base.WebCaseBase;

public class taikangActionTest extends WebCaseBase {
    @Test
    public void taikang2019() throws Exception{
        taikangAction action=new taikangAction();
        action.order();


    }
}
