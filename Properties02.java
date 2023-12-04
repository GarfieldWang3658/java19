package com.hspedu.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //1、Propertiesのオブジェクトを新規します
        Properties properties = new Properties();
        //2.指定の設定ファイルをロードします。
        properties.load(new FileReader("/Users/garfield/Documents/JavaE-Leanning/Chapter19/src/mysql.properties"));
        //3、k-vをモニターに示す
        properties.list(System.out);
        //4、Kでバリューを取得します
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("user");
    }
}
