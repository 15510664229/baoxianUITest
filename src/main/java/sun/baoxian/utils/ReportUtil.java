package sun.baoxian.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ReportUtil {

    /*
     * 1. REPORT_PATH 表示你的报告路径
     * 2. 务必保证extent.css和extent.js 两个文件和报告在同一个目录下
     */

    private static final String REPORT_PATH="report/index_new.html";

    public static void addCssAndJs() throws Exception {
        Document html=Jsoup.parse(new File(REPORT_PATH), "UTF-8");
        Element linkCss=html.select("link").get(2);
        linkCss.attr("href","extent.css");
        Element scriptJs=html.select("script").get(1);
        scriptJs.attr("src", "extent.js");
        FileOutputStream fos = new FileOutputStream(REPORT_PATH, false);
        fos.write(html.html().getBytes());
        fos.close();
    }

    public static void main(String[] args) throws Exception {
        addCssAndJs();
    }



}

