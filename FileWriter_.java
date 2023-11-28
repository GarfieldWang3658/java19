package com.hspedu.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "/Users/garfield/note.txt/";
        //オブジェクトを新規
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);//初期は上書きになります
            //3、write(int):単体の文字を書込みます
            fileWriter.write('H');

            //4、write(char[])：文字配列を書込みます
            fileWriter.write(chars);

            //5、write(char[],off,len)：文字配列を書込みます、文字配列の書込み範囲は指定可能です
            fileWriter.write("chars".toCharArray(),0,4);

            //6、write(String)：文字列を書込みます
            fileWriter.write("こんにちは");

            //7、write(String,off,lem):文字列を書込みます、文字列の書込み範囲は指定可能です
            fileWriter.write("おはようございます",0,4);
            //データー量が多い時にループを使用します


        } catch (IOException e) {
           e.printStackTrace();
        }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println("終了....");
    }
}
