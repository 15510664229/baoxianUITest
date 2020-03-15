package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.taikangAction;
import sun.baoxian.actions.yangguangAction;
import sun.baoxian.base.WebCaseBase;

public class yanguangTest extends WebCaseBase {
    @Test
    public void yangguang_BW_001() throws Exception{
        yangguangAction action=new yangguangAction();
        action.yangguangBW();
    }
    @Test
    public void yanguang_ZH_001()throws Exception{
        yangguangAction action=new yangguangAction();
        action.yangguangZH();

    }
}
