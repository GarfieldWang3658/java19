package com.hspedu.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        //BufferedInputStream
        String filePath = "/Users/garfield/news04.txt";//元ファイルのアドレス
        String destFilePath = "/Users/garfield/news08.txt";//コピー先のアドレス
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
           br = new BufferedReader(new FileReader(filePath));
           bw = new BufferedWriter(new FileWriter(destFilePath));

           while ((line = br.readLine())
                   !=null){
               bw.write(line);
           }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bw != null){
                bw.close();
            }
        }

    }
}
