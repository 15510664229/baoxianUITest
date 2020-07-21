package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//爱心人寿——年金险_对象库类
public class AiXinLifePage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   AiXinLifePage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-AiXinLife.yml");
getLocatorMap();
}
/***
* insure
* @return
* @throws IOException
*/
public  LocatorBase insure() throws IOException
 {
   LocatorBase locator=getLocator("insure");
   return locator;
 }

/***
* ver
* @return
* @throws IOException
*/
public  LocatorBase ver() throws IOException
 {
   LocatorBase locator=getLocator("ver");
   return locator;
 }

/***
* success
* @return
* @throws IOException
*/
public  LocatorBase success() throws IOException
 {
   LocatorBase locator=getLocator("success");
   return locator;
 }

/***
* aplname
* @return
* @throws IOException
*/
public  LocatorBase aplname() throws IOException
 {
   LocatorBase locator=getLocator("aplname");
   return locator;
 }

/***
* aplidcard
* @return
* @throws IOException
*/
public  LocatorBase aplidcard() throws IOException
 {
   LocatorBase locator=getLocator("aplidcard");
   return locator;
 }

/***
* aplmobile
* @return
* @throws IOException
*/
public  LocatorBase aplmobile() throws IOException
 {
   LocatorBase locator=getLocator("aplmobile");
   return locator;
 }

/***
* apleml
* @return
* @throws IOException
*/
public  LocatorBase apleml() throws IOException
 {
   LocatorBase locator=getLocator("apleml");
   return locator;
 }

/***
* apl_city
* @return
* @throws IOException
*/
public  LocatorBase apl_city() throws IOException
 {
   LocatorBase locator=getLocator("apl_city");
   return locator;
 }

/***
* apl_citycont
* @return
* @throws IOException
*/
public  LocatorBase apl_citycont() throws IOException
 {
   LocatorBase locator=getLocator("apl_citycont");
   return locator;
 }

/***
* bankcard
* @return
* @throws IOException
*/
public  LocatorBase bankcard() throws IOException
 {
   LocatorBase locator=getLocator("bankcard");
   return locator;
 }

/***
* bankmobile
* @return
* @throws IOException
*/
public  LocatorBase bankmobile() throws IOException
 {
   LocatorBase locator=getLocator("bankmobile");
   return locator;
 }

/***
* protocol_but
* @return
* @throws IOException
*/
public  LocatorBase protocol_but() throws IOException
 {
   LocatorBase locator=getLocator("protocol_but");
   return locator;
 }

/***
* apladdress
* @return
* @throws IOException
*/
public  LocatorBase apladdress() throws IOException
 {
   LocatorBase locator=getLocator("apladdress");
   return locator;
 }

/***
* insname
* @return
* @throws IOException
*/
public  LocatorBase insname() throws IOException
 {
   LocatorBase locator=getLocator("insname");
   return locator;
 }

/***
* insidcard
* @return
* @throws IOException
*/
public  LocatorBase insidcard() throws IOException
 {
   LocatorBase locator=getLocator("insidcard");
   return locator;
 }
}