package sun.http;


import org.bytedeco.javacpp.presets.opencv_core;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 思路整理：
 * 每个产品创建一个uid
 * 然后用这个uid 创建对应的预约单，实验一个长险
 * 再通过正向流程检查每个预约单的接口返回值，编辑保存预约单
 * 通过接口检查、保存完预约单以后
 * 通过ui自动化对预约单进行核保-投保操作，进入到收银台
 */
public class yuyuedan {
    public static String getMatcher(String regex, String source) {
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }

    public static void main(String args[]) {
        yuyuedan y=new yuyuedan();
        //创建预约单接口请求
        String url = "http://test.admin.dianxiao.ncfimg.com/DxParamData/save";
        String s = "tag_id_edit=&plat_goods_id=107&client_id=AutoTester";
        String json1 = BackEndHttpRequest.sendGet(url, s);
        //创建接口返回值{"error":xxx "record":xxxx,"dianxiao":{"order_no":xxx,"seat_url":xxx,"user_url":xxx,"is_lightbox":1},"errmsg":ok}
        JSONObject json = new JSONObject(json1);
        System.out.println(json);
        JSONObject result = (JSONObject) json.get("record");
        System.out.println(result);
        String id = (String) result.get("lightbox_url");
        JSONObject dianxiao = (JSONObject) result.get("dianxiao");
        String seat_url = dianxiao.getString("seat_url");
        String user_url = dianxiao.getString("user_url");
        String regex = "id=(.*)";
        //获取数据库id字段值
        id = getMatcher(regex, id);
        System.out.println(id);
        System.out.println(seat_url);
        System.out.println(user_url);


        String url1 = "http://test.admin.dianxiao.ncfimg.com/family/query";
        String content = "id=" + id;
        String j1 = BackEndHttpRequest.sendPost(url1, content);
        //家庭关系查询返回json ，即 数据库表中记录的字段值
        JSONObject queryResult = new JSONObject(j1);
        System.out.println(queryResult);

        //json校验
        y.comparej(queryResult);

        String url2="http://test.admin.dianxiao.ncfimg.com/family/save";
        String  content1="id="+id+"&insure_type=1&family_id=65188&relation=1";
        String  saveinsure=BackEndHttpRequest.sendPost(url2,content1);
        System.out.println(new  JSONObject(saveinsure));
    }

    public  void  comparej(JSONObject jsonObject) {
        //这个就是你设定的标准JSON
        InputStream inputStream = getClass().getResourceAsStream("/query.json");
        //这个是你打算验证的JSON，这里我也用一份文件来存放，你也可以使用string或者jsonObject
       // InputStream inputStream1 = getClass().getResourceAsStream("/failure.json");
        JSONObject Schema = new JSONObject(new JSONTokener(inputStream));
       // JSONObject data = new JSONObject(new JSONTokener(inputStream1));
        Schema schema = SchemaLoader.load(Schema);
        try {
            schema.validate(jsonObject);
            System.out.println("校验成功！");
        } catch (ValidationException e) {
            System.out.println(e.getErrorMessage());
        }
    }




}
