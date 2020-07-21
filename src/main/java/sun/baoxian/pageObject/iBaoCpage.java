package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//阳光I保C-二月版_对象库类
public class iBaoCpage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   iBaoCpage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-iBaoC2.yml");
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
* price
* @return
* @throws IOException
*/
public  LocatorBase price() throws IOException
 {
   LocatorBase locator=getLocator("price");
   return locator;
 }

/***
* price2
* @return
* @throws IOException
*/
public  LocatorBase price2() throws IOException
 {
   LocatorBase locator=getLocator("price2");
   return locator;
 }

/***
* city
* @return
* @throws IOException
*/
public  LocatorBase city() throws IOException
 {
   LocatorBase locator=getLocator("city");
   return locator;
 }

/***
* citycont
* @return
* @throws IOException
*/
public  LocatorBase citycont() throws IOException
 {
   LocatorBase locator=getLocator("citycont");
   return locator;
 }

/***
* queding
* @return
* @throws IOException
*/
public  LocatorBase quding() throws IOException
 {
   LocatorBase locator=getLocator("quding");
   return locator;
 }

/***
* birth
* @return
* @throws IOException
*/
public  LocatorBase birth() throws IOException
 {
   LocatorBase locator=getLocator("birth");
   return locator;
 }

/***
* birthcont
* @return
* @throws IOException
*/
public  LocatorBase birthcont() throws IOException
 {
   LocatorBase locator=getLocator("birthcont");
   return locator;
 }

/***
* pay_20Y
* @return
* @throws IOException
*/
public  LocatorBase pay_20Y() throws IOException
 {
   LocatorBase locator=getLocator("pay_20Y");
   return locator;
 }

/***
* pay_10Y
* @return
* @throws IOException
*/
public  LocatorBase pay_10Y() throws IOException
 {
   LocatorBase locator=getLocator("pay_10Y");
   return locator;
 }

/***
* pay_type_Y
* @return
* @throws IOException
*/
public  LocatorBase pay_type_Y() throws IOException
 {
   LocatorBase locator=getLocator("pay_type_Y");
   return locator;
 }

/***
* pay_type_M
* @return
* @throws IOException
*/
public  LocatorBase pay_type_M() throws IOException
 {
   LocatorBase locator=getLocator("pay_type_M");
   return locator;
 }

/***
* baoer15
* @return
* @throws IOException
*/
public  LocatorBase baoer15() throws IOException
 {
   LocatorBase locator=getLocator("baoer15");
   return locator;
 }

/***
* baoer30
* @return
* @throws IOException
*/
public  LocatorBase baoer30() throws IOException
 {
   LocatorBase locator=getLocator("baoer30");
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
* height
* @return
* @throws IOException
*/
public  LocatorBase height() throws IOException
 {
   LocatorBase locator=getLocator("height");
   return locator;
 }

/***
* weight
* @return
* @throws IOException
*/
public  LocatorBase weight() throws IOException
 {
   LocatorBase locator=getLocator("weight");
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
* bankcode
* @return
* @throws IOException
*/
public  LocatorBase bankcode() throws IOException
 {
   LocatorBase locator=getLocator("bankcode");
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
* code
* @return
* @throws IOException
*/
public  LocatorBase code() throws IOException
 {
   LocatorBase locator=getLocator("code");
   return locator;
 }
}