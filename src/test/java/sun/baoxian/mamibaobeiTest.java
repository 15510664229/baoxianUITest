package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.jiangxinAction;
import sun.baoxian.actions.mamibaobeiAction;
import sun.baoxian.base.WebCaseBase;

public class mamibaobeiTest extends WebCaseBase {
    @Test
    public void mamibaobei() throws Exception{
        mamibaobeiAction action=new mamibaobeiAction();
        action.mamibaobei_001();
    }
}
