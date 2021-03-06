package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.shortInsurance19Action;
import sun.baoxian.base.WebCaseBase;

import static sun.baoxian.actions.mobileList.TEST;

public class shortInsuranceTest  extends WebCaseBase {
    String sc1zh="http://test.bxm.ncfimg.com/biz/page/info?page_id=62&is_gray=1&goods_code=G2823849253";
    String sc1Y="http://test.bxm.ncfimg.com/biz/page/info?page_id=70&is_gray=1&goods_code=G1580975301";
    //String sc1M="http://test.bxm.ncfimg.com/biz/page/info?page_id=71&is_gray=1&goods_code=G1579598079";
    String zh1="http://test.bxm.ncfimg.com/biz/page/info?page_id=177&is_gray=1&goods_code=G1582880569";
    String zh3="http://test.bxm.ncfimg.com/biz/page/info?page_id=176&is_gray=1&goods_code=G1582881659";
    String zhph="http://test.bxm.ncfimg.com/biz/page/info?page_id=178&is_gray=1&goods_code=G1582702861";
    String jiangao="http://test.bxm.ncfimg.com/biz/page/info?page_id=100&is_gray=1&goods_code=G2823849253#/";


    @Test
    public void taikang2020_SC_ZH() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(sc1zh);
    }
    //月缴链接测试环境有问题
    public void taikang2020_SC_Y() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(sc1Y);
    }
    @Test
    //带健康告知的url
    public void taikang2020_JG() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(jiangao);
    }
   //测试环境的链接配置有问题 不执行了
    public void taikang2020_PH_001() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.pinghuaY_001();
    }
    //学平险收费版
    String StudentCharge="http://test.bxm.ncfimg.com/biz/page/info?page_id=248&is_gray=1&goods_code=G1585191131#/";
    //阳光少儿意外plus版
    String yangguangPlusurl="http://test.bxm.ncfimg.com/biz/page/info?page_id=242&is_gray=1&goods_code=G1585118141#/";
    @Test
    public void studentCharge () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(StudentCharge,TEST);
    }
    @Test
    public void yangguangPlus () throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.StudentTmp(yangguangPlusurl,TEST);
    }

    @Test
    public void zhonghui_001() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(zh1);
    }
    @Test
    public void zhonghui_002() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(zh3);
    }
    @Test
    public void zhonghui_003() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.shortTmptest(zhph);
    }
    @Test
    public void yangguang_ZHYW() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.YG_ZH_Plus();
    }
    @Test
    public void yangguang_BWYW() throws Exception{
        shortInsurance19Action action=new shortInsurance19Action();
        action.YG_BW_Plus();
    }
}
