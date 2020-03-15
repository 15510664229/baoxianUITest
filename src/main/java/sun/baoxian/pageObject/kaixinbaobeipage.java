package sun.baoxian.pageObject;

import java.io.IOException;
import java.io.InputStream;

import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//华瑞-开心宝贝_对象库类

public class kaixinbaobeipage extends WebActionBase {
    //用于eclipse工程内运行查找对象库文件路径
    private String path = "src/main/resources/pageObjectFiles/yml/";

    public kaixinbaobeipage() {
//工程内读取对象库文件
        setXmlObjectPath(path + "/UILibrary-kaixinbaobei.yml");
        getLocatorMap();
    }

    /***
     * baoe60w
     * @return
     * @throws IOException
     */
    public LocatorBase baoe60w() throws IOException {
        LocatorBase locator = getLocator("baoe60w");
        return locator;
    }

    /***
     * baoe40w
     * @return
     * @throws IOException
     */
    public LocatorBase baoe40w() throws IOException {
        LocatorBase locator = getLocator("baoe40w");
        return locator;
    }

    /***
     * baoe30w
     * @return
     * @throws IOException
     */
    public LocatorBase baoe30w() throws IOException {
        LocatorBase locator = getLocator("baoe30w");
        return locator;
    }

    /***
     * baoe20w
     * @return
     * @throws IOException
     */
    public LocatorBase baoe20w() throws IOException {
        LocatorBase locator = getLocator("baoe20w");
        return locator;
    }

    /***
     * baoe10w
     * @return
     * @throws IOException
     */
    public LocatorBase baoe10w() throws IOException {
        LocatorBase locator = getLocator("baoe10w");
        return locator;
    }

    /***
     * baoe50w
     * @return
     * @throws IOException
     */
    public LocatorBase baoe50w() throws IOException {
        LocatorBase locator = getLocator("baoe50w");
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
     * fuhe
     * @return
     * @throws IOException
     */
    public LocatorBase fuhe() throws IOException {
        LocatorBase locator = getLocator("fuhe");
        return locator;
    }

    /***
     * mobile
     * @return
     * @throws IOException
     */
    public LocatorBase mobile() throws IOException {
        LocatorBase locator = getLocator("mobile");
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
     * city
     * @return
     * @throws IOException
     */
    public LocatorBase city() throws IOException {
        LocatorBase locator = getLocator("city");
        return locator;
    }

    /***
     * sure
     * @return
     * @throws IOException
     */
    public LocatorBase sure() throws IOException {
        LocatorBase locator = getLocator("sure");
        return locator;
    }

    /***
     * period30
     * @return
     * @throws IOException
     */
    public LocatorBase peroid30() throws IOException {
        LocatorBase locator = getLocator("peroid30");
        return locator;
    }

    /***
     * period60
     * @return
     * @throws IOException
     */
    public LocatorBase peroid60() throws IOException {
        LocatorBase locator = getLocator("peroid60");
        return locator;
    }

    /***
     * period70
     * @return
     * @throws IOException
     */
    public LocatorBase peroid70() throws IOException {
        LocatorBase locator = getLocator("peroid70");
        return locator;
    }

    /***
     * pay_type
     * @return
     * @throws IOException
     */
    public LocatorBase pay_type() throws IOException {
        LocatorBase locator = getLocator("pay_type");
        return locator;
    }

    /***
     * shengji
     * @return
     * @throws IOException
     */
    public LocatorBase shengji() throws IOException {
        LocatorBase locator = getLocator("shengji");
        return locator;
    }

    /***
     * quzhifu
     * @return
     * @throws IOException
     */
    public LocatorBase quzhifu() throws IOException {
        LocatorBase locator = getLocator("quzhifu");
        return locator;
    }

    /***
     * confrim
     * @return
     * @throws IOException
     */
    public LocatorBase confrim() throws IOException {
        LocatorBase locator = getLocator("confrim");
        return locator;
    }

    /***
     * addbankcard
     * @return
     * @throws IOException
     */
    public LocatorBase addbankcard() throws IOException {
        LocatorBase locator = getLocator("addbankcard");
        return locator;
    }

    /***
     * code
     * @return
     * @throws IOException
     */
    public LocatorBase code() throws IOException {
        LocatorBase locator = getLocator("code");
        return locator;
    }

    /***
     * bankcard
     * @return
     * @throws IOException
     */
    public LocatorBase bankcard() throws IOException {
        LocatorBase locator = getLocator("bankcard");
        return locator;
    }

    /***
     * mobile1
     * @return
     * @throws IOException
     */
    public LocatorBase mobile1() throws IOException {
        LocatorBase locator = getLocator("mobile1");
        return locator;
    }

    /***
     * sms
     * @return
     * @throws IOException
     */
    public LocatorBase sms() throws IOException {
        LocatorBase locator = getLocator("sms");
        return locator;
    }

    /***
     * queren
     * @return
     * @throws IOException
     */
    public LocatorBase queren() throws IOException {
        LocatorBase locator = getLocator("queren");
        return locator;
    }

    /***
     * tongyixieyi
     * @return
     * @throws IOException
     */
    public LocatorBase tongyixieyi() throws IOException {
        LocatorBase locator = getLocator("tongyixieyi");
        return locator;
    }

    /***
     * bangka
     * @return
     * @throws IOException
     */
    public LocatorBase bangka() throws IOException {
        LocatorBase locator = getLocator("bangka");
        return locator;
    }

    /***
     * success
     * @return
     * @throws IOException
     */
    public LocatorBase success() throws IOException {
        LocatorBase locator = getLocator("success");
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