package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    //new File(String pathname)
    public void create01(){
        String filePath = "Chapter19\\create01.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    //new File(File parent,String child)//根据父目录文件+子路径构建
    public void create02(){
        String userHome = System.getProperty("user.home");
        File parentFile = new File(userHome);
        String fileName = "news02.txt";
        //这里的file 对象，在java程序中只是一个对象。
        //只有执行了creatNewFile方法，才会真正的在磁盘创建文件
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create03(){
        String userHome = System.getProperty("user.home");
        String parentPath = userHome;
        String fileName = "Hello.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
