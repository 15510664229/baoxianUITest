package sun.baoxian.utils;

import java.io.File;

public class FileUtils {
    /**
     * 迭代删除文件夹
     * @param dirPath 文件夹路径
     */
    public static void deleteDir(String dirPath){
        File file = new File(dirPath);// 读取
        if(file.isFile()){ // 判断是否是文件夹
            file.delete();// 删除
        }else{
            File[] files = file.listFiles(); // 获取文件
            if(files == null){
                file.delete();// 删除
            }else{
                for (int i = 0; i < files.length; i++){// 循环
                    deleteDir(files[i].getAbsolutePath());
                }
                file.delete();// 删除
            }
        }
        File file1 = new File("/report/snapshot");
        file1.mkdir();//创建文件夹

    }
    public static void main(String args[]){
        deleteDir("D:\\selenium\\baoxianUITest\\report\\snapshot");
    }
}
