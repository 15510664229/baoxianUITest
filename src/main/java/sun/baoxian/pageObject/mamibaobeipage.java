package sun.baoxian.pageObject;

import java.io.IOException;
import java.io.InputStream;

import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//复兴联合-妈咪宝贝_对象库类

public class mamibaobeipage extends WebActionBase {
    //用于eclipse工程内运行查找对象库文件路径
    private String path = "src/main/resources/pageObjectFiles/yml/";

    public mamibaobeipage() {
//工程内读取对象库文件
        setXmlObjectPath(path + "/UILibrary-mamibaobei.yml");
        getLocatorMap();
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
     * baoe20
     * @return
     * @throws IOException
     */
    public LocatorBase baoe20() throws IOException {
        LocatorBase locator = getLocator("baoe20");
        return locator;
    }

    /***
     * baoe30
     * @return
     * @throws IOException
     */
    public LocatorBase baoe30() throws IOException {
        LocatorBase locator = getLocator("baoe30");
        return locator;
    }

    /***
     * baoe40
     * @return
     * @throws IOException
     */
    public LocatorBase baoe40() throws IOException {
        LocatorBase locator = getLocator("baoe40");
        return locator;
    }

    /***
     * baoe50
     * @return
     * @throws IOException
     */
    public LocatorBase baoe50() throws IOException {
        LocatorBase locator = getLocator("baoe50");
        return locator;
    }

    /***
     * baoe60
     * @return
     * @throws IOException
     */
    public LocatorBase baoe60() throws IOException {
        LocatorBase locator = getLocator("baoe60");
        return locator;
    }

    /***
     * baoe70
     * @return
     * @throws IOException
     */
    public LocatorBase baoe70() throws IOException {
        LocatorBase locator = getLocator("baoe70");
        return locator;
    }

    /***
     * baoe80
     * @return
     * @throws IOException
     */
    public LocatorBase baoe80() throws IOException {
        LocatorBase locator = getLocator("baoe80");
        return locator;
    }

    /***
     * period20
     * @return
     * @throws IOException
     */
    public LocatorBase period20() throws IOException {
        LocatorBase locator = getLocator("period20");
        return locator;
    }

    /***
     * period25
     * @return
     * @throws IOException
     */
    public LocatorBase period25() throws IOException {
        LocatorBase locator = getLocator("period25");
        return locator;
    }

    /***
     * period30
     * @return
     * @throws IOException
     */
    public LocatorBase period30() throws IOException {
        LocatorBase locator = getLocator("period30");
        return locator;
    }

    /***
     * period70A
     * @return
     * @throws IOException
     */
    public LocatorBase period70A() throws IOException {
        LocatorBase locator = getLocator("period70A");
        return locator;
    }

    /***
     * period80A
     * @return
     * @throws IOException
     */
    public LocatorBase period80A() throws IOException {
        LocatorBase locator = getLocator("period80A");
        return locator;
    }

    /***
     * periodZ
     * @return
     * @throws IOException
     */
    public LocatorBase periodZ() throws IOException {
        LocatorBase locator = getLocator("periodZ");
        return locator;
    }

    /***
     * pay5
     * @return
     * @throws IOException
     */
    public LocatorBase pay5() throws IOException {
        LocatorBase locator = getLocator("pay5");
        return locator;
    }

    /***
     * pay10
     * @return
     * @throws IOException
     */
    public LocatorBase pay10() throws IOException {
        LocatorBase locator = getLocator("pay10");
        return locator;
    }

    /***
     * pay15
     * @return
     * @throws IOException
     */
    public LocatorBase pay15() throws IOException {
        LocatorBase locator = getLocator("pay15");
        return locator;
    }

    /***
     * pay20
     * @return
     * @throws IOException
     */
    public LocatorBase pay20() throws IOException {
        LocatorBase locator = getLocator("pay20");
        return locator;
    }

    /***
     * pay25
     * @return
     * @throws IOException
     */
    public LocatorBase pay25() throws IOException {
        LocatorBase locator = getLocator("pay25");
        return locator;
    }

    /***
     * pay30
     * @return
     * @throws IOException
     */
    public LocatorBase pay30() throws IOException {
        LocatorBase locator = getLocator("pay30");
        return locator;
    }

    /***
     * ercizhongji
     * @return
     * @throws IOException
     */
    public LocatorBase ercizhongji() throws IOException {
        LocatorBase locator = getLocator("ercizhongji");
        return locator;
    }

    /***
     * tejihanjianbing
     * @return
     * @throws IOException
     */
    public LocatorBase tejihanjianbing() throws IOException {
        LocatorBase locator = getLocator("tejihanjianbing");
        return locator;
    }

    /***
     * toubaorenhuomian
     * @return
     * @throws IOException
     */
    public LocatorBase toubaorenhuomian() throws IOException {
        LocatorBase locator = getLocator("toubaorenhuomian");
        return locator;
    }

    /***
     * jiangao
     * @return
     * @throws IOException
     */
    public LocatorBase jiangao() throws IOException {
        LocatorBase locator = getLocator("jiangao");
        return locator;
    }

    /***
     * ins_name
     * @return
     * @throws IOException
     */
    public LocatorBase ins_name() throws IOException {
        LocatorBase locator = getLocator("ins_name");
        return locator;
    }

    /***
     * ins_idcard
     * @return
     * @throws IOException
     */
    public LocatorBase ins_idcard() throws IOException {
        LocatorBase locator = getLocator("ins_idcard");
        return locator;
    }

    /***
     * changqi
     * @return
     * @throws IOException
     */
    public LocatorBase changqi() throws IOException {
        LocatorBase locator = getLocator("changqi");
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
     * email
     * @return
     * @throws IOException
     */
    public LocatorBase email() throws IOException {
        LocatorBase locator = getLocator("email");
        return locator;
    }

    /***
     * address
     * @return
     * @throws IOException
     */
    public LocatorBase address() throws IOException {
        LocatorBase locator = getLocator("address");
        return locator;
    }

    /***
     * postcode
     * @return
     * @throws IOException
     */
    public LocatorBase postcode() throws IOException {
        LocatorBase locator = getLocator("postcode");
        return locator;
    }

    /***
     * shengao
     * @return
     * @throws IOException
     */
    public LocatorBase shengao() throws IOException {
        LocatorBase locator = getLocator("shengao");
        return locator;
    }

    /***
     * tizhong
     * @return
     * @throws IOException
     */
    public LocatorBase tizhong() throws IOException {
        LocatorBase locator = getLocator("tizhong");
        return locator;
    }

    /***
     * apl_name
     * @return
     * @throws IOException
     */
    public LocatorBase apl_name() throws IOException {
        LocatorBase locator = getLocator("apl_name");
        return locator;
    }

    /***
     * apl_idcard
     * @return
     * @throws IOException
     */
    public LocatorBase apl_idcard() throws IOException {
        LocatorBase locator = getLocator("apl_idcard");
        return locator;
    }

    /***
     * bank_card
     * @return
     * @throws IOException
     */
    public LocatorBase bank_card() throws IOException {
        LocatorBase locator = getLocator("bank_card");
        return locator;
    }

    /***
     * bank_mobile
     * @return
     * @throws IOException
     */
    public LocatorBase bank_mobile() throws IOException {
        LocatorBase locator = getLocator("bank_mobile");
        return locator;
    }

    /***
     * xieyi
     * @return
     * @throws IOException
     */
    public LocatorBase xieyi() throws IOException {
        LocatorBase locator = getLocator("xieyi");
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