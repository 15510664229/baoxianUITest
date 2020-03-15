package sun.baoxian.pageObject;

import java.io.IOException;
import java.io.InputStream;

import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//人保航意-精灵保_对象库类

public class jinglingpage extends WebActionBase {
    //用于eclipse工程内运行查找对象库文件路径
    private String path = "src/main/resources/pageObjectFiles/yml/";

    public jinglingpage() {
//工程内读取对象库文件
        setXmlObjectPath(path + "/UILibrary-jinglingbao.yml");
        getLocatorMap();
    }

    /***
     * plan
     * @return
     * @throws IOException
     */
    public LocatorBase plan() throws IOException {
        LocatorBase locator = getLocator("plan");
        return locator;
    }

    /***
     * plan500
     * @return
     * @throws IOException
     */
    public LocatorBase plan500() throws IOException {
        LocatorBase locator = getLocator("plan500");
        return locator;
    }

    /***
     * plan1000
     * @return
     * @throws IOException
     */
    public LocatorBase plan1000() throws IOException {
        LocatorBase locator = getLocator("plan1000");
        return locator;
    }

    /***
     * plan2000
     * @return
     * @throws IOException
     */
    public LocatorBase plan2000() throws IOException {
        LocatorBase locator = getLocator("plan2000");
        return locator;
    }

    /***
     * plan3000
     * @return
     * @throws IOException
     */
    public LocatorBase plan3000() throws IOException {
        LocatorBase locator = getLocator("plan3000");
        return locator;
    }

    /***
     * submit
     * @return
     * @throws IOException
     */
    public LocatorBase submit() throws IOException {
        LocatorBase locator = getLocator("submit");
        return locator;
    }

    /***
     * woyaotoubao
     * @return
     * @throws IOException
     */
    public LocatorBase woyaotoubao() throws IOException {
        LocatorBase locator = getLocator("woyaotoubao");
        return locator;
    }

    /***
     * sms_code
     * @return
     * @throws IOException
     */
    public LocatorBase sms_code() throws IOException {
        LocatorBase locator = getLocator("sms_code");
        return locator;
    }

    /***
     * confirm
     * @return
     * @throws IOException
     */
    public LocatorBase confirm() throws IOException {
        LocatorBase locator = getLocator("confirm");
        return locator;
    }

    /***
     * pay
     * @return
     * @throws IOException
     */
    public LocatorBase pay() throws IOException {
        LocatorBase locator = getLocator("pay");
        return locator;
    }

    /***
     * deadline
     * @return
     * @throws IOException
     */
    public LocatorBase deadline() throws IOException {
        LocatorBase locator = getLocator("deadline");
        return locator;
    }
}