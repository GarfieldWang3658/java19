package com.hspedu.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        String filePath ="/Users/garfield/Documents/JavaE-Leanning/Chapter19/src/dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        properties.list(System.out);
        String name = properties.get("name")+"";//Object->String;
        int age = Integer.parseInt(properties.get("age")+"");//Object->int;
        String color = properties.get("color")+"";//Object->String

        Dog dog = new Dog(name,age,color);
        System.out.println("オブジェクトインフォメーション");
        System.out.println(dog);

        String serFilePath = "/Users/garfield/DOG.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dogオブジェクトシリアル化完了");


    }
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "/Users/garfield/DOG.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();//下方転型
        System.out.println("逆シリアル化");
        System.out.println(dog);
        ois.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private  String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
