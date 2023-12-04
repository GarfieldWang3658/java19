package com.hspedu;

import org.junit.jupiter.api.Test;

public class BufferedReader_ extends Reader_ {
    private Reader_ reader_;//ステータスはReader_クラス

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    public void readFile(){
        reader_.readFile();
    }
@Test
    public void readFiles(int num) {
    for (int i = 0; i < num; i++) {
        reader_.readFile();
    }
}
@Test
        public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
    }

