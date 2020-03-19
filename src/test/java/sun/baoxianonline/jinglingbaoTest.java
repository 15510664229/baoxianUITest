package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.jinglingbaoAction;
import sun.baoxian.base.WebCaseBase;

public class jinglingbaoTest extends WebCaseBase {
    @Test
    public void jingling() throws Exception{
        jinglingbaoAction action=new jinglingbaoAction();
        action.jinglingbao_002();
    }


}
