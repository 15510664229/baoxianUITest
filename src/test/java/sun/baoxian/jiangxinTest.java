package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.jiangxinAction;
import sun.baoxian.base.WebCaseBase;

public class jiangxinTest  extends WebCaseBase {
    @Test
    public void jiangxin() throws Exception{
        jiangxinAction  action=new jiangxinAction();
        action.jiangxin_001();
    }
}
