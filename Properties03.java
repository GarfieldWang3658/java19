package com.hspedu.properties_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        //Propertiesで　クラスを新規します、ファイルを設定し、修正します。
        Properties properties = new Properties();
        //１、ファイルのkeyがなければ新規することになります。
        //２、ファイルのkeyがあれば修正することになります。
        //propertiesの親クラスはHashtable、ベースはHashtableのメソッドです
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","888888");
        //k-v ファイルに保存します
        properties.store(new FileOutputStream("/Users/garfield/Documents/JavaE-Leanning/Chapter19/src/mysql2.properties"),
                "ここはコメントを入れます");

        System.out.println("設定ファイルをセーブしました");

    }


    }

