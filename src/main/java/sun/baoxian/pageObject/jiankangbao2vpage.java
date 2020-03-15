package sun.baoxian.pageObject;

import java.io.IOException;
import java.io.InputStream;

import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//华瑞-健康保2.0_对象库类

public class jiankangbao2vpage extends WebActionBase {
    //用于eclipse工程内运行查找对象库文件路径
    private String path = "src/main/resources/pageObjectFiles/yml/";

    public jiankangbao2vpage() {
//工程内读取对象库文件
        setXmlObjectPath(path + "/UILibrary-jiankangbao2V.yml");
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
     * jiaoqing
     * @return
     * @throws IOException
     */
    public LocatorBase jiaoqing() throws IOException {
        LocatorBase locator = getLocator("jiaoqing");
        return locator;
    }

    /***
     * payY
     * @return
     * @throws IOException
     */
    public LocatorBase payY() throws IOException {
        LocatorBase locator = getLocator("payY");
        return locator;
    }

    /***
     * period10
     * @return
     * @throws IOException
     */
    public LocatorBase period10() throws IOException {
        LocatorBase locator = getLocator("period10");
        return locator;
    }

    /***
     * period15
     * @return
     * @throws IOException
     */
    public LocatorBase period15() throws IOException {
        LocatorBase locator = getLocator("period15");
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
     * period30
     * @return
     * @throws IOException
     */
    public LocatorBase period30() throws IOException {
        LocatorBase locator = getLocator("period30");
        return locator;
    }

    /***
     * exzlbxj
     * @return
     * @throws IOException
     */
    public LocatorBase exzlbxj() throws IOException {
        LocatorBase locator = getLocator("exzlbxj");
        return locator;
    }

    /***
     * setdjbbxj
     * @return
     * @throws IOException
     */
    public LocatorBase setdjbbxj() throws IOException {
        LocatorBase locator = getLocator("setdjbbxj");
        return locator;
    }

    /***
     * crtdjbbxj
     * @return
     * @throws IOException
     */
    public LocatorBase crtdjbbxj() throws IOException {
        LocatorBase locator = getLocator("crtdjbbxj");
        return locator;
    }

    /***
     * zdjbyljt
     * @return
     * @throws IOException
     */
    public LocatorBase zdjbyljt() throws IOException {
        LocatorBase locator = getLocator("zdjbyljt");
        return locator;
    }

    /***
     * sfqcjbzmqbxj
     * @return
     * @throws IOException
     */
    public LocatorBase sfqcjbzmqbxj() throws IOException {
        LocatorBase locator = getLocator("sfqcjbzmqbxj");
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
     * queding
     * @return
     * @throws IOException
     */
    public LocatorBase queding() throws IOException {
        LocatorBase locator = getLocator("queding");
        return locator;
    }

    /***
     * self
     * @return
     * @throws IOException
     */
    public LocatorBase self() throws IOException {
        LocatorBase locator = getLocator("self");
        return locator;
    }

    /***
     * mate
     * @return
     * @throws IOException
     */
    public LocatorBase mate() throws IOException {
        LocatorBase locator = getLocator("mate");
        return locator;
    }

    /***
     * child
     * @return
     * @throws IOException
     */
    public LocatorBase child() throws IOException {
        LocatorBase locator = getLocator("child");
        return locator;
    }

    /***
     * parent
     * @return
     * @throws IOException
     */
    public LocatorBase parent() throws IOException {
        LocatorBase locator = getLocator("parent");
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
     * apl_mobile
     * @return
     * @throws IOException
     */
    public LocatorBase apl_mobile() throws IOException {
        LocatorBase locator = getLocator("apl_mobile");
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
     * submitF
     * @return
     * @throws IOException
     */
    public LocatorBase submitF() throws IOException {
        LocatorBase locator = getLocator("submitF");
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
     * success
     * @return
     * @throws IOException
     */
    public LocatorBase success() throws IOException {
        LocatorBase locator = getLocator("success");
        return locator;
    }

    /***
     * baodan
     * @return
     * @throws IOException
     */
    public LocatorBase baodan() throws IOException {
        LocatorBase locator = getLocator("baodan");
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
     * deadline
     * @return
     * @throws IOException
     */
    public LocatorBase deadline() throws IOException {
        LocatorBase locator = getLocator("deadline");
        return locator;
    }
}