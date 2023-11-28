package com.hspedu.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) throws IOException {


        String filePath = "/Users/garfield/news04.txt/";
        FileReader fileReader = null;
        int data = 0;
        //byte[] buf = new byte[1024];
        try {
            fileReader = new FileReader(filePath);
            //単独文字のロード
            while ((data = fileReader.read()) != -1){
                System.out.print((char)data);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null ){
                fileReader.close();
            }
        }
    }
    @Test
    public void readFile02(){
        String filePath = "/Users/garfield/news04.txt/";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            //単独文字のロード
            //戻り値は-１になったら、ファイルの最末端になります
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null ){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

