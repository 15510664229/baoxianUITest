package sun.baoxian;

import org.testng.annotations.Test;
import sun.baoxian.actions.fangaiAction;
import sun.baoxian.base.WebCaseBase;
import sun.baoxian.utils.FileUtils;

public class DleteHistoryImg  {
    @Test
    public void DleteHistoryImg() throws Exception{
        FileUtils.deleteDir("report/snapshot");
    }

}
