package com.hspedu.outputstream_;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {


        String srcfilePath = "/Users/garfield/news02.txt";
        String destFilePath = "/Users/garfield/news04.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {

            fileInputStream  = new FileInputStream(srcfilePath);
            fileOutputStream  = new FileOutputStream(destFilePath);
            //文字配列を定義し、効率化
            byte[]buf = new byte[2014];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf))!=-1){
                //読み取り後、fileoutputStreamでファイルに書込みます。
                //読み取りと書き込みを同時に執行します
                fileOutputStream.write(buf,0,readLen);//このメソッドを使います。

            }
            System.out.println("コピー成功");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}


