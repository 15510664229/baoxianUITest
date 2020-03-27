package sun.baoxian_fox;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.base.WebCaseBase;

public class duolaAbaoTest  extends WebCaseBase {
    String url="https://bxm.ncfimg.com/biz/page/info?page_id=27&goods_code=G1582255066&channel=124&fr=504&product_code=P7020200006&__pl__=";
    String url1="http://test.bxm.ncfimg.com/biz/page/info?page_id=105&is_gray=1&goods_code=G1581501768#/";
    @Test
    public void duolaAbao() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.duolaAbao_003(url);
    }
}
