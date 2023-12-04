package com.hspedu.homework;

import java.io.*;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "/Users/garfield/mytemp";
        File dp = new File(directoryPath);
        if (!dp.exists()) {
            if (dp.mkdir()) {
                System.out.println(dp + "を新規しました");
            } else {
                System.out.println(dp+"を新規する事ができません");
            }}else{
                System.out.println(dp + "はすでに存在しています");
            }
            String filePath = dp + "/hello.txt";
            File fp = new File(filePath);
            if (!(fp.exists())) {
                if (fp.createNewFile()) {
                    System.out.println(fp + "を新規しました");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fp));
                    bufferedWriter.write("hello,world~");
                    System.out.println("hello,world~を入力しました");
                    bufferedWriter.close();

                } else {
                    System.out.println(fp + "を新規する事はできませんでした");
                }}else{
                    System.out.println(fp+"はすでに存在しています");
                }

        }
    }

