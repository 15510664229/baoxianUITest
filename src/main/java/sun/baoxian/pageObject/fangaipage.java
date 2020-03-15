package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//众惠-防癌_对象库类
public class fangaipage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   fangaipage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-fangai.yml");
getLocatorMap();
}
/***
* lijilingqu
* @return
* @throws IOException
*/
public  LocatorBase lijilingqu() throws IOException
 {
   LocatorBase locator=getLocator("lijilingqu");
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