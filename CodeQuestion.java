package com.hspedu.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //1、BufferedReader「処理ストリーム」という入力ストリームを新規します。
        //２、BufferedReaderで対象ファイルを読み取ります。
        //3、基本はエンコーディングの「utf-8」でファイルを読み取ります。
        String filepath = "/Users/garfield/news08.txt";
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        String s = br.readLine();
        System.out.println("読み取った内容＝"+s);
        br.close();

    }
}
