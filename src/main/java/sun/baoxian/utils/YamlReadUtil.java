package sun.baoxian.utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import sun.baoxian.base.LocatorBase.ByType;
import sun.baoxian.base.LocatorBase;

/**
 * Description: Author: 沙陌 Date: 2019-01-15
 */
public class YamlReadUtil {
    public static void main(String args[]) throws FileNotFoundException, YamlException, UnsupportedEncodingException {
        String path = "src/main/resources/pageObjectFiles/yml/UILibrary.yml";
        YamlReadUtil yamlReadUtil = new YamlReadUtil();
        yamlReadUtil.getLocatorMap(path, "com.testfan.ui.auto.pageObject.BingPage");
        yamlReadUtil.getYamlPageUrl(path, "com.testfan.ui.auto.pageObject.BingPage");
    }

    /**
     *
     * @param path     对象库文件地址
     * @param pageName pageName 页面名字
     * @return 返回locator 哈希表 locatorName:locator
     * @throws UnsupportedEncodingException
     *
     * {"loginBtn":new LocatorBase(),"username":new LocatorBase(),"password":new LocatorBase()}
     */
    public HashMap<String, LocatorBase> getLocatorMap(String path, String pageName)
            throws FileNotFoundException, YamlException, UnsupportedEncodingException {
        HashMap<String, LocatorBase> locatorHashMap = new HashMap<>();
        YamlReader yamlReader = new YamlReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        Object yamlObject = yamlReader.read();
        Map yamlMap = (Map) yamlObject;
        ArrayList<HashMap<String, Object>> pages = (ArrayList<HashMap<String, Object>>) yamlMap.get("pages");
        for (int i = 0; i < pages.size(); i++)// 遍历Page节点
        {
            HashMap<String, Object> pageNode = pages.get(i);// 获取page节点
            HashMap<String, Object> pageElement = (HashMap<String, Object>) pageNode.get("page");
            if (pageElement.get("pageName").toString().equalsIgnoreCase(pageName))// 判断是否需要获取的Page节点
            {
//                System.out.println(pageElement.get("desc"));
                List<HashMap<String, Object>> locators = (List<HashMap<String, Object>>) pageElement.get("locators");// 获取locators列表
                for (int j = 0; j < locators.size(); j++)// 遍历locators列表
                {
                    HashMap<String, Object> locatorNode = locators.get(j);
                    LocatorBase locator = new LocatorBase();
                    locator.setType(getByType(locatorNode.get("type").toString()));
                    locator.setValue(locatorNode.get("value").toString());
                    locator.setTimout(Integer.parseInt(locatorNode.get("timeout").toString()));
                    locator.setLocatorName(locatorNode.get("name").toString());
                    locatorHashMap.put(locatorNode.get("name").toString(), locator);
                }

            } else {
                continue;
            }
//            System.out.println(pageObjet);
        }
//        System.out.println(locatorHashMap.get("登录").getLocalorName());
        return locatorHashMap;

    }

    public String getYamlPageUrl(String path, String pageName) throws FileNotFoundException, YamlException {
        Map<String, LocatorBase> locatorHashMap = new HashMap<>();
        YamlReader yamlReader = new YamlReader(new FileReader(path));
        Object yamlObject = yamlReader.read();
        Map yamlMap = (Map) yamlObject;
        ArrayList<HashMap<String, Object>> pages = (ArrayList<HashMap<String, Object>>) yamlMap.get("pages");
        String url = "";
        for (int i = 0; i < pages.size(); i++)// 遍历Page节点
        {
            HashMap<String, Object> pageNode = pages.get(i);// 获取page节点
            HashMap<String, Object> pageElement = (HashMap<String, Object>) pageNode.get("page");
            if (pageElement.get("pageName").toString().equalsIgnoreCase(pageName))// 判断是否需要获取的Page节点
            {
//                System.out.println(pageElement.get("desc"));
                url = pageElement.get("value").toString();
            } else {
                continue;
            }
//            System.out.println(pageObjet);
        }
        System.out.println(url);
        return url;
    }

    /**
     * @param type
     */
    public static ByType getByType(String type) {
        LocatorBase.ByType byType = LocatorBase.ByType.xpath;
        if (type == null || type.equalsIgnoreCase("xpath")) {
            byType = LocatorBase.ByType.xpath;
        } else if (type.equalsIgnoreCase("id")) {
            byType = LocatorBase.ByType.id;
        } else if (type.equalsIgnoreCase("linkText")) {
            byType = LocatorBase.ByType.linkText;
        } else if (type.equalsIgnoreCase("name")) {
            byType = LocatorBase.ByType.name;
        } else if (type.equalsIgnoreCase("className")) {
            byType = LocatorBase.ByType.className;
        } else if (type.equalsIgnoreCase("cssSelector")) {
            byType = LocatorBase.ByType.cssSelector;
        } else if (type.equalsIgnoreCase("partialLinkText")) {
            byType = LocatorBase.ByType.partialLinkText;
        } else if (type.equalsIgnoreCase("tagName")) {
            byType = LocatorBase.ByType.tagName;
        }
        return byType;
    }
}
