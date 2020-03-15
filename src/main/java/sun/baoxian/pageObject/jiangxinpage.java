package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//国华人寿-匠心保_对象库类
public class jiangxinpage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   jiangxinpage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-jiangxin.yml");
getLocatorMap();
}
/***
* submit
* @return
* @throws IOException
*/
public  LocatorBase submit() throws IOException
 {
   LocatorBase locator=getLocator("submit");
   return locator;
 }

/***
* female
* @return
* @throws IOException
*/
public  LocatorBase female() throws IOException
 {
   LocatorBase locator=getLocator("female");
   return locator;
 }

/***
* male
* @return
* @throws IOException
*/
public  LocatorBase male() throws IOException
 {
   LocatorBase locator=getLocator("male");
   return locator;
 }

/***
* in_birth
* @return
* @throws IOException
*/
public  LocatorBase in_birth() throws IOException
 {
   LocatorBase locator=getLocator("in_birth");
   return locator;
 }

/***
* amount10
* @return
* @throws IOException
*/
public  LocatorBase amount10() throws IOException
 {
   LocatorBase locator=getLocator("amount10");
   return locator;
 }

/***
* amount20
* @return
* @throws IOException
*/
public  LocatorBase amount20() throws IOException
 {
   LocatorBase locator=getLocator("amount20");
   return locator;
 }

/***
* amount30
* @return
* @throws IOException
*/
public  LocatorBase amount30() throws IOException
 {
   LocatorBase locator=getLocator("amount30");
   return locator;
 }

/***
* amount40
* @return
* @throws IOException
*/
public  LocatorBase amount40() throws IOException
 {
   LocatorBase locator=getLocator("amount40");
   return locator;
 }

/***
* internal20
* @return
* @throws IOException
*/
public  LocatorBase internal20() throws IOException
 {
   LocatorBase locator=getLocator("internal20");
   return locator;
 }

/***
* internal30
* @return
* @throws IOException
*/
public  LocatorBase internal30() throws IOException
 {
   LocatorBase locator=getLocator("internal30");
   return locator;
 }

/***
* pay_Y
* @return
* @throws IOException
*/
public  LocatorBase pay_Y() throws IOException
 {
   LocatorBase locator=getLocator("pay_Y");
   return locator;
 }

/***
* pay_M
* @return
* @throws IOException
*/
public  LocatorBase pay_M() throws IOException
 {
   LocatorBase locator=getLocator("pay_M");
   return locator;
 }

/***
* jiangao
* @return
* @throws IOException
*/
public  LocatorBase jiangao() throws IOException
 {
   LocatorBase locator=getLocator("jiangao");
   return locator;
 }

/***
* name
* @return
* @throws IOException
*/
public  LocatorBase name() throws IOException
 {
   LocatorBase locator=getLocator("name");
   return locator;
 }

/***
* idcard
* @return
* @throws IOException
*/
public  LocatorBase idcard() throws IOException
 {
   LocatorBase locator=getLocator("idcard");
   return locator;
 }

/***
* mobile
* @return
* @throws IOException
*/
public  LocatorBase mobile() throws IOException
 {
   LocatorBase locator=getLocator("mobile");
   return locator;
 }

/***
* sms_code
* @return
* @throws IOException
*/
public  LocatorBase sms_code() throws IOException
 {
   LocatorBase locator=getLocator("sms_code");
   return locator;
 }

/***
* bank_card
* @return
* @throws IOException
*/
public  LocatorBase bank_card() throws IOException
 {
   LocatorBase locator=getLocator("bank_card");
   return locator;
 }

/***
* bank_code
* @return
* @throws IOException
*/
public  LocatorBase bank_code() throws IOException
 {
   LocatorBase locator=getLocator("bank_code");
   return locator;
 }

/***
* submitF
* @return
* @throws IOException
*/
public  LocatorBase submitF() throws IOException
 {
   LocatorBase locator=getLocator("submitF");
   return locator;
 }

/***
* confirm
* @return
* @throws IOException
*/
public  LocatorBase confirm() throws IOException
 {
   LocatorBase locator=getLocator("confirm");
   return locator;
 }

/***
* pay
* @return
* @throws IOException
*/
public  LocatorBase pay() throws IOException
 {
   LocatorBase locator=getLocator("pay");
   return locator;
 }

/***
* deadline
* @return
* @throws IOException
*/
public  LocatorBase deadline() throws IOException
 {
   LocatorBase locator=getLocator("deadline");
   return locator;
 }
}