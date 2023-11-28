package com.hspedu.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {


    }
    //FileOutputStreamでファイルにデーターを書き込みます。
    //ファイルがなければ、該当ファイルを新規します。
    @Test
    public void writeFile(){
        //オブジェクトを新規します
        String filePath = "/Users/garfield/ABC.txt";
        FileOutputStream fileOutputStream = null;
        String str = "hello world";

        try {
            //オブジェクトをゲットします
            //1、new FileOutputStream(filePath)で書込みをする場合は元のデーターを上書きします。
            //２、元のデーターを上書きしたくなければnew FileOutputStream(filePath,true)にすると
            //書込みのデーターは元データーの後ろから追加する形に　なります。
            fileOutputStream = new FileOutputStream(filePath);
            //書き込み
            //fileOutputStream.write('a');
            //Stringを書き込みます
            //getBytes()メソッドは 文字列 ->　文字配列
            //write(byte[]b,int off,int len)
            //int off->書込みの開始位置を設定する
            //int len->書込み文字の数を設定する
            fileOutputStream.write(str.getBytes(),0,4);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
