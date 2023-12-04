package com.hspedu.homework;

import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/garfield/news04.txt";
        String line = "";
        int lineNum =0 ;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath),"utf-8"));
        while ((line = br.readLine())!=null ){
            System.out.println(++lineNum+"、"+line);
            if (br !=null) {
                br.close();
            }

        }

    }
}
