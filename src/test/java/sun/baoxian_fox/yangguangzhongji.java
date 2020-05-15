package sun.baoxian_fox;

import org.testng.annotations.Test;
import sun.baoxian.actions.duolaAbaoAction;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.YYH;

public class yangguangzhongji extends WebCaseBase {
    String url="https://bxm.ncfimg.com/biz/page/info?page_id=PAGE1586750027&is_gray=1&goods_code=G1586748386#/";
    @Test
    public void yangguangzhongji() throws Exception{
        duolaAbaoAction action=new duolaAbaoAction();
        action.yangguangzhongji(url,YYH);
    }
}
