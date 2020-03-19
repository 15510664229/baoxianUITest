package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.changqingbaoAction;
import sun.baoxian.base.WebCaseBase;

public class changqingbaoTest extends WebCaseBase {
    @Test
    public void changqingbao() throws Exception{
        changqingbaoAction action=new changqingbaoAction();
        action.changqingbao_002();
    }
}
