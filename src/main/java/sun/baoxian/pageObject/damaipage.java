package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//华贵大麦年缴版_对象库类
public class damaipage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   damaipage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-huaguidamai.yml");
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
* payY
* @return
* @throws IOException
*/
public  LocatorBase payY() throws IOException
 {
   LocatorBase locator=getLocator("payY");
   return locator;
 }

/***
* payM
* @return
* @throws IOException
*/
public  LocatorBase payM() throws IOException
 {
   LocatorBase locator=getLocator("payM");
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
* jiangao_new
* @return
* @throws IOException
*/
public  LocatorBase jiangao_new() throws IOException
 {
   LocatorBase locator=getLocator("jiangao_new");
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
* ins_mobile
* @return
* @throws IOException
*/
public  LocatorBase ins_mobile() throws IOException
 {
   LocatorBase locator=getLocator("ins_mobile");
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
* address_new
* @return
* @throws IOException
*/
public  LocatorBase address_new() throws IOException
 {
   LocatorBase locator=getLocator("address_new");
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
* queding
* @return
* @throws IOException
*/
public  LocatorBase queding() throws IOException
 {
   LocatorBase locator=getLocator("queding");
   return locator;
 }

/***
* shengao
* @return
* @throws IOException
*/
public  LocatorBase shengao() throws IOException
 {
   LocatorBase locator=getLocator("shengao");
   return locator;
 }

/***
* tizhong
* @return
* @throws IOException
*/
public  LocatorBase tizhong() throws IOException
 {
   LocatorBase locator=getLocator("tizhong");
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
* bank_mobile
* @return
* @throws IOException
*/
public  LocatorBase bank_mobile() throws IOException
 {
   LocatorBase locator=getLocator("bank_mobile");
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