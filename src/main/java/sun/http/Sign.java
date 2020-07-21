package sun.http;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.*;
import com.google.common.collect.Maps;

public class Sign {
    public static String sign(String content,String time){
        String appid="baoxian";
        String salt="6dc9f2e53213db2ea51e354198af2488";//找红光要
        //content=base64(content);
        TreeMap<String, String> params = new TreeMap<>();
        params.put("appid",appid);
        params.put("t",time);
        params.put("content",content);
        sortByKey(params,false);
        String sign="";
        Iterator<Map.Entry<String,String>> iter = params.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            String key = entry.getKey();
            String value = entry.getValue();
            sign=sign+key+"="+value+"&";
        }
        int le=sign.length();
        sign=sign.substring(0, le-1);
        sign=sign+salt;
        sign=MD5(sign).substring(16,31);
        return sign;

    }
    public static  String  timestamp(){
        long timestamp =  System.currentTimeMillis()/ 1000;
        return String.valueOf(timestamp);
    }

    //length用户要求产生字符串的长度
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }




    /**
     * 根据map的key排序
     *
     * @param map 待排序的map
     * @param isDesc 是否降序，true：降序，false：升序
     * @return 排序好的map
     * @author zero 2019/04/08
     */
    public static <K extends Comparable<? super K>, V> Map<K, V> sortByKey(Map<K, V> map, boolean isDesc) {
        Map<K, V> result = Maps.newLinkedHashMap();
        if (isDesc) {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey().reversed())
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        } else {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey())
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        }
        return result;
    }

    /**
     * MD5加密工具类
     * @author pibigstar
     *
     *///盐，用于混交md5
    private static final String slat = "6dc9f2e53213db2ea51e354198af2488";
    public static String encrypt(String dataStr) {
        try {
            dataStr = dataStr + slat;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(dataStr.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public final static String MD5(String s){
        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                'e', 'f'};
        try {
            byte[] strTemp = s.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        }
        catch (Exception e){
            return null;
        }
    }

    public static String base64(String str) {
        byte[] bytes = str.getBytes();

        //Base64 加密
        String encoded = Base64.getEncoder().encodeToString(bytes);
        //Base64 解密
        byte[] decoded = Base64.getDecoder().decode(str);
        String decodeStr = new String(decoded);

        return  decodeStr;
    }
}





