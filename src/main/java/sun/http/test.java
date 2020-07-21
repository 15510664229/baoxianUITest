package sun.http;
import org.json.JSONArray;
import org.json.JSONObject;

public class test {
    public  static  void  main(String args[]){
        String s="";
        String content=Sign.base64("sxp");
        String t=Sign.timestamp();
        String sign=Sign.sign(content,t);
        String appid="baoxian";
        s="content="+content+"&appid="+appid+"&sign="+sign+"&t="+t;
       // System.out.println(s);
        String json1= BackEndHttpRequest.sendPost("http://test.enc.zkydib.com/encrypt",s);
        JSONObject json = new JSONObject(json1);
        System.out.println(json.get("data"));
        System.out.println(json.get("errmsg"));
//        JSONArray jsonArray = json.getJSONArray("data");
//        System.out.println(jsonArray);
//        for (int i = 0; i < jsonArray.length(); i++) {
//            JSONObject sonObject = jsonArray.getJSONObject(i);
//            String s1 = (String) sonObject.get("time");
//            Double bigDecimal = (Double) sonObject.get("flow");
//            System.out.println(s1);
//            System.out.println(bigDecimal);
//        }
    }
}
