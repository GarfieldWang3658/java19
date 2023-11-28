package com.hspedu.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void reeadFile01(){
        String filePath = "/Users/garfield/Hello.txt";
        int readData = 0;
        FileInputStream fileInputStream=null;
        try {
            //FileInputStreamオブジェクトでファイルを読み取る
            fileInputStream = new FileInputStream(filePath);
            //
            //return = -1 読み取り終了
            while((readData = fileInputStream.read())!=-1){
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //ソースを終了させ
            try {
                fileInputStream.close();
            } catch (IOException e) {
               e.printStackTrace();
            }

        }
    }
    @Test
    //read(byte[]b)で読み取りの効率化
    public void reeadFile02(){
        String filePath = "/Users/garfield/Hello.txt";
        FileInputStream fileInputStream=null;
        byte[]buf = new byte[8];
        int readLen = 0;
        try {
            //FileInputStreamオブジェクトでファイルを読み取る
            fileInputStream = new FileInputStream(filePath);
            //
            //-1をリターンした場合、読み取り終了
            //正常に読み取った場合、実際読み取ったバイト数をリターンします。
            while((readLen=fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //ソースを終了させ
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

