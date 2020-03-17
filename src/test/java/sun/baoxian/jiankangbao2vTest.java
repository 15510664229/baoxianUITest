package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.jiankangbao2vAction;
import sun.baoxian.actions.mamibaobeiAction;
import sun.baoxian.base.WebCaseBase;

public class jiankangbao2vTest extends WebCaseBase {
    @Test
    public void jiankangbao() throws Exception{
        jiankangbao2vAction action=new jiankangbao2vAction();
        action.jiankangbao_001();
    }
}
