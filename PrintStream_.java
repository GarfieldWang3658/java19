package com.hspedu.printStream_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream  out = System.out;
        //初期状態　PrintStreamの出力対象はモニターになります。
        out.print("あにき、おっす！");
        /*
            public void print(String s) {
        write(String.valueOf(s));
    }
         */
        //printのベースはwriteメソッドを使用しました。
        out.write("親分、おっす！".getBytes());
        out.close();
        //出力のデバイスとアドレスを変更することは可能です
        //出力のアドレスを"/Users/garfield/news01.txt"に変更しました。
        //"若頭、おっす！"は上記アドレスのファイルに出力します。
        /*
          public static void setOut(PrintStream out) {
        checkIO();
        setOut0(out);
    }
         */
        System.setOut(new PrintStream("/Users/garfield/news01.txt"));
        System.out.println("若頭、おっす！");

    }
}
