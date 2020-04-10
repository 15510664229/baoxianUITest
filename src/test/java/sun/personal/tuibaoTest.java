package sun.personal;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.actions.personalAction;
import sun.baoxian.base.WebCaseBase;

public class tuibaoTest  extends WebCaseBase {
    @Test
    public void tuibao() throws Exception{
        personalAction action=new personalAction();
        action.tuibao();
    }
}
