package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.huaguidamaiAction;
import sun.baoxian.base.WebCaseBase;

public class huaguidamaiTest  extends WebCaseBase {
    String damaitest="http://test.bxm.ncfimg.com/biz/page/info?page_id=158&is_gray=1&goods_code=G1582533358#/";
    //华贵大麦
    @Test
    public void huaguidamaiTest () throws Exception{
        huaguidamaiAction action=new huaguidamaiAction();
        action.damai_test(damaitest);
    }
}
