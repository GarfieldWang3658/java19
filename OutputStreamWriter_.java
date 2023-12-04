package com.hspedu.transformation;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/garfield/hsp.txt";
        String charSet = "utf8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("よ！おっす〜！ちわっす〜！");
        osw.close();
        System.out.println(charSet+"でファイルを保存します");


    }
}
