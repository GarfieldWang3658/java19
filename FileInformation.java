package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void Info(){
        File file = new File("/Users/garfield/news02.txt");
        //getName
        System.out.println("文件名字="+file.getName());
        //getAbsolutePath
        System.out.println("文件绝对路径="+file.getAbsolutePath());
        // getParent
        System.out.println("文件父级目录="+file.getParent());
        // length
        System.out.println("文件字节大小="+file.length());
        // exists
        System.out.println("文件是否存在="+file.exists());
        // ifFile
        System.out.println("是不是一个文件="+file.isFile());
        // isDirectory
        System.out.println("是不是一个目录="+file.isDirectory());
    }

}
