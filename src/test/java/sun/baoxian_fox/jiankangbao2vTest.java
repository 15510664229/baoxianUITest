package sun.baoxian_fox;


import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.actions.jiankangbao2vAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.SXP;
import static sun.baoxian.actions.mobileList.YYH;


public class jiankangbao2vTest extends WebCaseBase {
    String url1="https://bxm.ncfimg.com/#/long_insurance/detail?product_code=701911S0061";
    String urlFac="https://h5.zkydib.com/biz/page/info?__t=1589277695&page_id=34&goods_code=G1582798321&channel=xinmeiti&fr=baoxianshangcheng_rexiaobx&product_code=P7020200007#/";
    @Test
    public void jiankangbao3() throws Exception{
        jiankangbao2vAction action=new jiankangbao2vAction();
        action.jiankangbao_fox(url1,YYH);
    }
    @Test
    public void jiankangbao_Fac() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.jiankangbao2(urlFac,YYH);
    }
}
