package com.hspedu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/garfield/good.txt";
        //オブジェクトを新規します
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));//文字は前の最後尾に追加することになります
        //new FileWriter(filePath) =>データーを上書きになります
        bufferedWriter.write("こんにちは");
        bufferedWriter.newLine();//システムに応じて行を変えます
        bufferedWriter.write("おはよう");
        bufferedWriter.newLine();//システムに応じて行を変えます
        bufferedWriter.write("こんばんは" );

        //外側を終了すれば、入力されたnew FileWriter(filePath)はベースで自動的に終了します。
        bufferedWriter.close();
    }
}
