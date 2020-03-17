package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.kaixinbaobeiAction;
import sun.baoxian.base.WebCaseBase;

public class kaixinbaobeiTest extends WebCaseBase {
    @Test
    public void kaixinbaobei() throws Exception{
        kaixinbaobeiAction action=new kaixinbaobeiAction();
        action.kaixinbaobei();
    }
}
