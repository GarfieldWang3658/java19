package com.hspedu.inputstream_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "/Users/garfield/news04.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //逆シリアル化の順番はシリアル化の順番と同じ
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //dog コンパイルタイプ Object
        //dog ランタイプ Dog
        Object dog = ois.readObject();
        System.out.println("実装クラス"+dog.getClass());
        System.out.println("dog情報＝"+dog);//ベースでは　Object->Dog

        //Dogクラスのメソッドを呼び出す場合は、ダウンキャストが必要になります
        //Dogクラスの定義を引き出す可能なエリアに移動する必要になります


        //外側のストリームを終了すればいい
        ois.close();



    }
}
