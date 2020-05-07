package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class duolaAbaoTest extends WebCaseBase {
    String urlgray="https://bxmgray.ncfimg.com/biz/page/info?page_id=27&goods_code=G1582255066&channel=124&fr=504&product_code=P7020200006&__pl__=";
    @Test
    public void duolaAbao() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.duolaAbao_003(urlgray,SXP);
    }
}
