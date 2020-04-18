package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.base.WebCaseBase;

public class duolaAbaoTest extends WebCaseBase {
    String testurl="http://test.bxm.ncfimg.com/biz/page/info?page_id=105&is_gray=1&goods_code=G1581501768#/";
    @Test
    public void duolaAbao() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.duolaAbao_001(testurl);
    }
}
