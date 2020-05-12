package sun.baoxian_fox;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;

public class youhuibao extends WebCaseBase {
    String url="https://bxm.ncfimg.com/biz/page/info?page_id=PC692601&goods_code=G1586943852&channel=124&fr=902&product_code=P7020200025&__pl__=";
    @Test
    public void youhuibao() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.youhuibao(url,SXP);
    }
}
