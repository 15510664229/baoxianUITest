package sun.baoxian.pageObject.yuyuedan;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//预约单后台登录页面_对象库类
public class loginpage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   loginpage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-yuyuedan.yml");
getLocatorMap();
}
/***
* username
* @return
* @throws IOException
*/
public  LocatorBase username() throws IOException
 {
   LocatorBase locator=getLocator("username");
   return locator;
 }

/***
* password
* @return
* @throws IOException
*/
public  LocatorBase password() throws IOException
 {
   LocatorBase locator=getLocator("password");
   return locator;
 }

/***
* verifycode
* @return
* @throws IOException
*/
public  LocatorBase verifycode() throws IOException
 {
   LocatorBase locator=getLocator("verifycode");
   return locator;
 }

/***
* imgver
* @return
* @throws IOException
*/
public  LocatorBase imgver() throws IOException
 {
   LocatorBase locator=getLocator("imgver");
   return locator;
 }

/***
* login
* @return
* @throws IOException
*/
public  LocatorBase login() throws IOException
 {
   LocatorBase locator=getLocator("login");
   return locator;
 }

/***
* error
* @return
* @throws IOException
*/
public  LocatorBase error() throws IOException
 {
   LocatorBase locator=getLocator("error");
   return locator;
 }
}