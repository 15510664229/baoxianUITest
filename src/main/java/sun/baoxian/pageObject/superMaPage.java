package sun.baoxian.pageObject;
import java.io.IOException;
import java.io.InputStream;
import sun.baoxian.base.WebActionBase;
import sun.baoxian.base.LocatorBase;
import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;//超级玛丽-牛保_对象库类
public class superMaPage extends WebActionBase {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/resources/pageObjectFiles/yml/";
 public   superMaPage() {
//工程内读取对象库文件
	setXmlObjectPath(path+"/UILibrary-SuperMarie.yml");
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
* apl_height
* @return
* @throws IOException
*/
public  LocatorBase apl_height() throws IOException
 {
   LocatorBase locator=getLocator("apl_height");
   return locator;
 }

/***
* apl_weight
* @return
* @throws IOException
*/
public  LocatorBase apl_weight() throws IOException
 {
   LocatorBase locator=getLocator("apl_weight");
   return locator;
 }

/***
* aplcardPeriod
* @return
* @throws IOException
*/
public  LocatorBase aplcardPeriod() throws IOException
 {
   LocatorBase locator=getLocator("aplcardPeriod");
   return locator;
 }

/***
* aplcardDate
* @return
* @throws IOException
*/
public  LocatorBase aplcardDate() throws IOException
 {
   LocatorBase locator=getLocator("aplcardDate");
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
* bankcitycont
* @return
* @throws IOException
*/
public  LocatorBase bankcitycont() throws IOException
 {
   LocatorBase locator=getLocator("bankcitycont");
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
* inscardPeriod
* @return
* @throws IOException
*/
public  LocatorBase inscardPeriod() throws IOException
 {
   LocatorBase locator=getLocator("inscardPeriod");
   return locator;
 }

/***
* inscardDate
* @return
* @throws IOException
*/
public  LocatorBase inscardDate() throws IOException
 {
   LocatorBase locator=getLocator("inscardDate");
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

/***
* insmobile
* @return
* @throws IOException
*/
public  LocatorBase insmobile() throws IOException
 {
   LocatorBase locator=getLocator("insmobile");
   return locator;
 }

/***
* inseml
* @return
* @throws IOException
*/
public  LocatorBase inseml() throws IOException
 {
   LocatorBase locator=getLocator("inseml");
   return locator;
 }

/***
* ins_job
* @return
* @throws IOException
*/
public  LocatorBase ins_job() throws IOException
 {
   LocatorBase locator=getLocator("ins_job");
   return locator;
 }

/***
* insaddress
* @return
* @throws IOException
*/
public  LocatorBase insaddress() throws IOException
 {
   LocatorBase locator=getLocator("insaddress");
   return locator;
 }

/***
* ins_city
* @return
* @throws IOException
*/
public  LocatorBase ins_city() throws IOException
 {
   LocatorBase locator=getLocator("ins_city");
   return locator;
 }

/***
* ins_citycont
* @return
* @throws IOException
*/
public  LocatorBase ins_citycont() throws IOException
 {
   LocatorBase locator=getLocator("ins_citycont");
   return locator;
 }

/***
* ins_height
* @return
* @throws IOException
*/
public  LocatorBase ins_height() throws IOException
 {
   LocatorBase locator=getLocator("ins_height");
   return locator;
 }

/***
* ins_weight
* @return
* @throws IOException
*/
public  LocatorBase ins_weight() throws IOException
 {
   LocatorBase locator=getLocator("ins_weight");
   return locator;
 }
}