package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//泰康下单_对象库类
public class taikangpage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   taikangpage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-taikang.yml");
getLocatorMap();
}
/***
* order
* @return
* @throws IOException
*/
public  LocatorBase order() throws IOException
 {
   LocatorBase locator=getLocator("order");
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
* shebao
* @return
* @throws IOException
*/
public  LocatorBase shebao() throws IOException
 {
   LocatorBase locator=getLocator("shebao");
   return locator;
 }

/***
* pay_type
* @return
* @throws IOException
*/
public  LocatorBase pay_type() throws IOException
 {
   LocatorBase locator=getLocator("pay_type");
   return locator;
 }

/***
* confrim
* @return
* @throws IOException
*/
public  LocatorBase confrim() throws IOException
 {
   LocatorBase locator=getLocator("confrim");
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
}