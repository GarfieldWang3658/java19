package com.hspedu.transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        new PrintWriter(new FileWriter("User/garfield/hello.txt"));
        printWriter.print("こんにちは");
        printWriter.close();//flush+CLose データーを書込み動作

    }
}
