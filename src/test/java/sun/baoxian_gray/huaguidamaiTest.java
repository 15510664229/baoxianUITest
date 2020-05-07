package sun.baoxian_gray;

import org.testng.annotations.Test;
import sun.baoxian.actions.huaguidamaiAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.YYH;

public class huaguidamaiTest extends WebCaseBase {
    String damaitest="https://bxmgray.ncfimg.com/biz/page/info?page_id=35&goods_code=G1583323079#/";
    //华泰-阳光综合意外plus版
    @Test
    public void huaguidamaiTest () throws Exception{
        huaguidamaiAction action=new huaguidamaiAction();
        action.damai(damaitest,YYH);
    }
}
