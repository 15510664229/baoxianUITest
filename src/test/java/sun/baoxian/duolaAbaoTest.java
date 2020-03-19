package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.base.WebCaseBase;

public class duolaAbaoTest extends WebCaseBase {
    @Test
    public void duolaAbao() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.duolaAbao_001();
    }
}
