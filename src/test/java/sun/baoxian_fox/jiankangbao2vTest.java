package sun.baoxian_fox;


import org.testng.annotations.Test;
import sun.baoxian.actions.jiankangbao2vAction;
import sun.baoxian.base.WebCaseBase;


public class jiankangbao2vTest extends WebCaseBase {
    @Test
    public void jiankangbao3() throws Exception{
        jiankangbao2vAction action=new jiankangbao2vAction();
        action.jiankangbao_003();
    }
}