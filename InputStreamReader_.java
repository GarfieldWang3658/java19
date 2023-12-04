package com.hspedu.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/garfield/news08.txt";
        //FileInputStream =(変換)=> InputStreamReader
        //エンコーディングタイプはutf-8
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
        //BufferedReader br = new BufferedReader(isr);
        //上記を簡略化
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath), "utf-8"));
        //読み取り
        String s = br.readLine();
        System.out.println("読み取った内容"+s);
        //外側ストリームを終了
        br.close();



    }
}
