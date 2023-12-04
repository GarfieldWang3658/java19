package com.hspedu.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //mysqlをロードします、ip、user、pwdを取得します。
        BufferedReader br = new BufferedReader(new FileReader("/Users/garfield/Documents/JavaE-Leanning/Chapter19/src/mysql.properties"));
        String Line = " ";
        while ((Line = br.readLine())!=null) {
            System.out.println(Line);
            String[] split = Line.split("=");
            if ("ip".equals(split[0])) {
                System.out.println(split[0] + "值是：" + split[1]);
            }
        }
        br.close();

    }
}
