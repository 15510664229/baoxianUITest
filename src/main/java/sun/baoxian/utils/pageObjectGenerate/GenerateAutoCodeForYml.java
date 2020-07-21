package sun.baoxian.utils.pageObjectGenerate;

import com.esotericsoftware.yamlbeans.YamlReader;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GenerateAutoCodeForYml {
    private static Logger log = Logger.getLogger(GenerateAutoCodeForYml.class);
    //填入需要构建java文件的yml地址
    static  String path="src/main/resources/pageObjectFiles/yml/UILibrary-AiXinLife.yml";
    public static void autoCode() throws Exception
    {
        File file = new File(path);
        if (!file.exists()) {
            throw new IOException("Can't find " + path);
        }
        YamlReader yamlReader=new YamlReader(new FileReader(file));
        Object yamlObject=yamlReader.read();
        Map yamlMap=(Map) yamlObject;
        ArrayList<HashMap<String,Object>> pages=(ArrayList<HashMap<String,Object>>)yamlMap.get("pages");//page列表
        for (int i=0;i<pages.size();i++)
        {
            HashMap<String,Object> pageNode=pages.get(i);//获取page节点
            HashMap<String,Object> pageElement=(HashMap<String,Object>)pageNode.get("page");
            //获取page节点的name属性值
            String pageName=pageElement.get("pageName").toString();
            System.out.println(pageName);
            //将pageName存储为数组
            String[] pageNameArray=pageName.split("\\.");
            System.out.println(pageNameArray.length);
            System.out.println(pageNameArray[0]);
            //获取要写入的page所属的类名
            String pageClassName=pageNameArray[pageNameArray.length-1].toString();
            //获取对象库包名
            StringBuffer buf=new StringBuffer();
            buf.append(pageNameArray[0].toString());
            for (int j=1; j<pageNameArray.length-1;j++){
                buf.append("."+pageNameArray[j].toString());
            }
            String packageName=buf.toString();
            String filePath = packageName.replaceAll( "\\.","/" );
            //    String packageName=pageNameArray[0].toString()+"."+pageNameArray[1].toString()+"."+pageNameArray[2].toString()+"."+pageNameArray[3].toString()+"."+pageNameArray[4].toString()+"."+pageNameArray[5].toString()+"."+pageNameArray[6].toString()+"."+pageNameArray[7].toString();
            //--自动编写对象库代码（XXPage.java）开始--
            StringBuffer sb=new StringBuffer("package "+packageName+";\n");
            sb.append("import java.io.IOException;\n");
            sb.append("import java.io.InputStream;\n");
            sb.append("import sun.baoxian.base.WebActionBase;\n");
            sb.append("import sun.baoxian.base.LocatorBase;\n");
            sb.append("import sun.baoxian.utils.pageObjectGenerate.GenerateAutoCodeForYml;");
            sb.append("//"+pageElement.get("desc")+"_对象库类\n");
            sb.append("public class "+ pageClassName+" extends WebActionBase {\n");
            sb.append("//用于eclipse工程内运行查找对象库文件路径\n");
            sb.append("private String path=\"src/main/resources/pageObjectFiles/yml/\";\n");
            sb.append(" public   "
                    + pageClassName
                    + "() {\n");
            sb.append("//工程内读取对象库文件\n	");
            sb.append("setXmlObjectPath(path+\"/UILibrary-AiXinLife.yml\");\n");
            sb.append("getLocatorMap();");
            sb.append("\n}");
            System.out.println(pageElement.get("desc"));
            List<HashMap<String,Object>> locators=(List<HashMap<String,Object>>)pageElement.get("locators");//获取locators列表
            for (int j=0;j<locators.size();j++)//遍历locators列表
            {
                //获取locator节点
                HashMap<String,Object> locatorNode=locators.get(j);
                String locatorName=locatorNode.get("name").toString();
                if (locatorNode.size()>3)
                {
                    sb.append("\n/***\n"
                            + "* "+locatorNode.get("desc")+"\n"
                            + "* @return\n"
                            + "* @throws IOException\n"
                            + "*/\n");
                } else
                {
                    sb.append("\n");
                }
                sb.append("public  LocatorBase "+locatorName+"() throws IOException\n {\n");
                sb.append("   LocatorBase locator=getLocator(\""+locatorName+"\");\n");
                sb.append("   return locator;\n }\n");
            }
            sb.append("}");
            //将自动生成的PageObject代码写入文件
            File pageObjectFile=new File("src/main/java/"+filePath+"/"+pageClassName+".java");
//            File pageObjectFile=new File("src/main/java/com/testfan/ui/auto/pageObject/"+pageClassName+".java");
            if(pageObjectFile.exists())
            {
                pageObjectFile.delete();;
            }
            try {
                FileWriter fileWriter=new FileWriter(pageObjectFile, false);
                BufferedWriter output = new BufferedWriter(fileWriter);
                output.write(sb.toString());
                output.flush();
                output.close();
            } catch (IOException e1) {
                // TODO 自动生成的 catch 块
                e1.printStackTrace();
            }
            System.out.println(sb);
            log.info("自动生成对象库java代码成功");
        }

    }
    public static void main(String[] args) throws Exception {
        // TODO 自动生成的方法存根
        GenerateAutoCodeForYml.autoCode();
    }

}


