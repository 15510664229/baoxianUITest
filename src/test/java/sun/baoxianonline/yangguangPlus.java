package sun.baoxianonline;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

public class yangguangPlus extends WebCaseBase {
    //阳光现在线上环境浏览器报错，先不添加到testng文件中
    String yangguangurl="https://bxm.ncfimg.com/biz/page/info?page_id=47&goods_code=G1584013312&channel=124&fr=670&product_code=P3020200023&__pl__=";
    //学平险收费版
    @Test
    public void studentCharge () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(yangguangurl);
    }
}
