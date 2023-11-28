package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {
    }

    @Test
    public void m1() {
        //news1.txtの存在を判断し、存在だったら削除します。
        String filePath = "/Users/garfield/news02.txt/";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "削除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("該当のファイルはありません");
        }
    }

    @Test
    //javaではディレクトリもファイルとして扱われます
    public void m2() {
        String filePath = "/Users/garfield/file/";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "\tディレクトリを削除しました");
            } else {
                System.out.println(filePath + "\tディレクトリの削除は失败しました");
            }
        } else {
            System.out.println("該当のディレクトリはありません");
        }
    }

    @Test
    public void m3() {
        String derectoryPath = "/Users/garfield/file/";
        File file = new File(derectoryPath);
        if (file.exists()) {
            System.out.println(derectoryPath + "がありました");
        } else {
            if (file.mkdir()) {
                System.out.println(derectoryPath + "\tディレクトリのクリエートは成功しました");
            } else {
                System.out.println(derectoryPath + "\tディレクトリのクリエートは失敗しました");
            }

        }
    }
}
