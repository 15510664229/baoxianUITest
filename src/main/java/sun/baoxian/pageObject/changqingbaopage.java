package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//北京人寿-长青保_对象库类
public class changqingbaopage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   changqingbaopage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-changqingbao.yml");
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
* jiangao1
* @return
* @throws IOException
*/
public  LocatorBase jiangao1() throws IOException
 {
   LocatorBase locator=getLocator("jiangao1");
   return locator;
 }

/***
* ins_name
* @return
* @throws IOException
*/
public  LocatorBase ins_name() throws IOException
 {
   LocatorBase locator=getLocator("ins_name");
   return locator;
 }

/***
* ins_idcard
* @return
* @throws IOException
*/
public  LocatorBase ins_idcard() throws IOException
 {
   LocatorBase locator=getLocator("ins_idcard");
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
* email
* @return
* @throws IOException
*/
public  LocatorBase email() throws IOException
 {
   LocatorBase locator=getLocator("email");
   return locator;
 }

/***
* address
* @return
* @throws IOException
*/
public  LocatorBase address() throws IOException
 {
   LocatorBase locator=getLocator("address");
   return locator;
 }

/***
* postcode
* @return
* @throws IOException
*/
public  LocatorBase postcode() throws IOException
 {
   LocatorBase locator=getLocator("postcode");
   return locator;
 }

/***
* self
* @return
* @throws IOException
*/
public  LocatorBase self() throws IOException
 {
   LocatorBase locator=getLocator("self");
   return locator;
 }

/***
* mate
* @return
* @throws IOException
*/
public  LocatorBase mate() throws IOException
 {
   LocatorBase locator=getLocator("mate");
   return locator;
 }

/***
* child
* @return
* @throws IOException
*/
public  LocatorBase child() throws IOException
 {
   LocatorBase locator=getLocator("child");
   return locator;
 }

/***
* parent
* @return
* @throws IOException
*/
public  LocatorBase parent() throws IOException
 {
   LocatorBase locator=getLocator("parent");
   return locator;
 }

/***
* job
* @return
* @throws IOException
*/
public  LocatorBase job() throws IOException
 {
   LocatorBase locator=getLocator("job");
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

/***
* apl_name
* @return
* @throws IOException
*/
public  LocatorBase apl_name() throws IOException
 {
   LocatorBase locator=getLocator("apl_name");
   return locator;
 }

/***
* apl_idcard
* @return
* @throws IOException
*/
public  LocatorBase apl_idcard() throws IOException
 {
   LocatorBase locator=getLocator("apl_idcard");
   return locator;
 }

/***
* tongyixieyi
* @return
* @throws IOException
*/
public  LocatorBase tongyixieyi() throws IOException
 {
   LocatorBase locator=getLocator("tongyixieyi");
   return locator;
 }
}