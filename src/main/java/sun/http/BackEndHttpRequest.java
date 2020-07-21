package sun.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class BackEndHttpRequest {

    public static String cookie="BXLG=0; __GUID__=27658451415937636775325293193778; __BX_DATAMARK_ST_=baoxian; NLTK=snologin; NLLG=0; __product_code__=P1020200007; __BX_DOT_PREV__=http%253A%252F%252Ftest.bxm.ncfimg.com%252Fbiz%252Fpage%252Finfo%253Fpage_id%253D62%2526is_gray%253D1%2526goods_code%253DG2823849253%2526_vConsole_%253D1%2526channel%253D113%2526fr%253D110%2526from%253Dsinglemessage%2526isappinstalled%253D0%2523%252F; __BX_DATAMARK_FR_=110; __BX_DATAMARK_CH_=113; cpinsadm_cryptCode=rHlSUxnNMQzweHq%252FwRflbrKBw08Jbptg7D1LsyAAjvJYscQmn0GVjxJCq8ZNCWpT; cpinsadm_capStyle=1; admin_tokens_bx2a=eyJ1c2VyIjoiZXlKdFlXbHNJam9pSWl3aWRYTmxjaUk2SW1Ga2JXbHVJaXdpYkc5bmFXNGlPblJ5ZFdVc0ltUnBjM0JzWVhraU9pSmNkVGRqWm1KY2RUZGxaR1pjZFRkaVlURmNkVGMwTURaY2RUVTBOVGdpTENKMWMyVnlhV1FpT2lJME9TSXNJbVJsY0dsa0lqcHVkV3hzTENKeWIyeGxhV1FpT2lJeE1DSXNJbWx3SWpvaU1qRTRMak13TGpFeE5pNHhPRFlpTENKc2IyZHBibk1pT2pJM015d2ljbTlzWlc1aGJXVWlPaUpjZFRoa09EVmNkVGRsWVRkY2RUZGlZVEZjZFRjME1EWmNkVFUwTlRnaWZRPT0iLCJleHBpcmUiOjE1OTQxNzU3MzYsInNpZ24iOiIwNmM0NGQyOTJjNWIxM2Q4OWIxODUzMTQ5Y2I2Yzc5NSJ9";
    /**
     * 向指定的URL发送GET方法的请求
     * @param url    发送请求的URL
     * @param param  请求参数，请求参数应该是 name1=value1&name2=value2 的形式
     * @return       远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader bufferedReader = null;
        try {
            //1、读取初始URL
            String urlNameString = url + "?" + param;
            //2、将url转变为URL类对象
            URL realUrl = new URL(urlNameString);

            //3、打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            //4、设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("cookie",cookie);
            //connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            //5、建立实际的连接
            connection.connect();
            //获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            //遍历所有的响应头字段
            for(String key : map.keySet()) {
                System.out.println(key + "---->" + map.get(key));
            }

            //6、定义BufferedReader输入流来读取URL的响应内容 ，UTF-8是后续自己加的设置编码格式，也可以去掉这个参数
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            String line = "";
            while(null != (line = bufferedReader.readLine())) {
                result += line;
            }
//            int tmp;
//            while((tmp = bufferedReader.read()) != -1){
//                result += (char)tmp;
//            }

        }catch (Exception e) {
            // TODO: handle exception
            System.out.println("发送GET请求出现异常！！！"  + e);
            e.printStackTrace();
        }finally {        //使用finally块来关闭输入流
            try {
                if(null != bufferedReader) {
                    bufferedReader.close();
                }
            }catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return result;
    }
    /**
     * 向指定的URL发送POST方法的请求
     * @param url    发送请求的URL
     * @param param  请求参数，请求参数应该是 name1=value1&name2=value2 的形式
     * @return       远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        String result = "";
        BufferedReader bufferedReader = null;
        PrintWriter out = null;
        try {
            //1、2、读取并将url转变为URL类对象
            URL realUrl = new URL(url);

            //3、打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            //4、设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("cookie",cookie);
            // 发送POST请求必须设置如下两行
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //5、建立实际的连接
            //connection.connect();
            //获取URLConnection对象对应的输出流
            out = new PrintWriter(connection.getOutputStream());
            //发送请求参数
            out.print(param);
            //flush输出流的缓冲
            out.flush();
            //

            //6、定义BufferedReader输入流来读取URL的响应内容
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            String line;
            while(null != (line = bufferedReader.readLine())) {
                result += line;
            }
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println("发送POST请求出现异常！！！"  + e);
            e.printStackTrace();
        }finally {        //使用finally块来关闭输出流、输入流
            try {
                if(null != out) {
                    out.close();
                }
                if(null != bufferedReader) {
                    bufferedReader.close();
                }
            }catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return result;
    }
}