package com.hspedu.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/garfield/news04.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        //１、行ごとにファイルを読み取ります。line = bufferedReader.readLine();
        //２、戻り値はnullになったら、ファイルの読み取りは完了しました。

        while ((line = bufferedReader.readLine()) != null ){
            System.out.println(line);
            bufferedReader.close();
            //ストリームを終了する時、BufferedReaderを終了すれば良い、
            // ベースはノードストリームを自動的に終了させます。
            /*
              public void close() throws IOException {
        Object lock = this.lock;
        if (lock instanceof InternalLock locker) {
            locker.lock();
            try {
                implClose();
            } finally {
                locker.unlock();
            }
        } else {
            synchronized (lock) {
                implClose();
            }
        }
    }

    private void implClose() throws IOException {
        if (in == null)
            return;
        try {
            in.close();//in = new FileReader(filePath)
        } finally {
            in = null;
            cb = null;
        }
    }
             */

        }




    }
}
