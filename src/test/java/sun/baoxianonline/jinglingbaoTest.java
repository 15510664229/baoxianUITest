package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.jinglingbaoAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.YYH;

public class jinglingbaoTest extends WebCaseBase {
    String url="https://bxm.ncfimg.com/web1/#/taikang_accident/detail?product_code=301912S0047&tid=19";
    @Test
    public void jingling() throws Exception{
        jinglingbaoAction action=new jinglingbaoAction();
        action.jinglingbao_002(url,YYH);
    }


}
