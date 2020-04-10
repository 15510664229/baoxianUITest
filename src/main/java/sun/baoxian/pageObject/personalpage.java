package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//个人中心_对象库类
public class personalpage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   personalpage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-personal.yml");
getLocatorMap();
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
* sms
* @return
* @throws IOException
*/
public  LocatorBase sms() throws IOException
 {
   LocatorBase locator=getLocator("sms");
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
* tuibao
* @return
* @throws IOException
*/
public  LocatorBase tuibao() throws IOException
 {
   LocatorBase locator=getLocator("tuibao");
   return locator;
 }

/***
* yiliaobaoxian
* @return
* @throws IOException
*/
public  LocatorBase yiliaobaoxian() throws IOException
 {
   LocatorBase locator=getLocator("yiliaobaoxian");
   return locator;
 }
}