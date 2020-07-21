package sun.baoxian.pageObject.yuyuedan;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//预约单后台首页_对象库类
public class homepage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   homepage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-yuyuedan.yml");
getLocatorMap();
}
/***
* menu_yuyuedan
* @return
* @throws IOException
*/
public  LocatorBase menu_yuyuedan() throws IOException
 {
   LocatorBase locator=getLocator("menu_yuyuedan");
   return locator;
 }

/***
* menu_list
* @return
* @throws IOException
*/
public  LocatorBase menu_list() throws IOException
 {
   LocatorBase locator=getLocator("menu_list");
   return locator;
 }

/***
* create
* @return
* @throws IOException
*/
public  LocatorBase create() throws IOException
 {
   LocatorBase locator=getLocator("create");
   return locator;
 }

/***
* plat_goods_id
* @return
* @throws IOException
*/
public  LocatorBase plat_goods_id() throws IOException
 {
   LocatorBase locator=getLocator("plat_goods_id");
   return locator;
 }

/***
* client_id2
* @return
* @throws IOException
*/
public  LocatorBase client_id2() throws IOException
 {
   LocatorBase locator=getLocator("client_id2");
   return locator;
 }

/***
* save
* @return
* @throws IOException
*/
public  LocatorBase save() throws IOException
 {
   LocatorBase locator=getLocator("save");
   return locator;
 }

/***
* first_edit
* @return
* @throws IOException
*/
public  LocatorBase first_edit() throws IOException
 {
   LocatorBase locator=getLocator("first_edit");
   return locator;
 }

/***
* search
* @return
* @throws IOException
*/
public  LocatorBase search() throws IOException
 {
   LocatorBase locator=getLocator("search");
   return locator;
 }

/***
* user_url
* @return
* @throws IOException
*/
public  LocatorBase user_url() throws IOException
 {
   LocatorBase locator=getLocator("user_url");
   return locator;
 }

/***
* save_success
* @return
* @throws IOException
*/
public  LocatorBase save_success() throws IOException
 {
   LocatorBase locator=getLocator("save_success");
   return locator;
 }

/***
* product_frame
* @return
* @throws IOException
*/
public  LocatorBase product_frame() throws IOException
 {
   LocatorBase locator=getLocator("product_frame");
   return locator;
 }


/***
* client_id
* @return
* @throws IOException
*/
public  LocatorBase client_id() throws IOException
 {
   LocatorBase locator=getLocator("client_id");
   return locator;
 }
}