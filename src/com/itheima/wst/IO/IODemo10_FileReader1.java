package com.itheima.wst.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IODemo10_FileReader1 {
    public static void main(String[] args) throws IOException {
        //fileReader类的使用
        //构造
        FileReader fr=new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        int c=fr.read();
        System.out.println((char)c);
        fr.close();

        //循环读取
        FileReader fr2=new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        int c2;
        while ((c2=fr2.read())!=-1){
            System.out.print((char)c2);
        }
        fr2.close();
        System.out.println("======================");

        //多组阅读
        FileReader fr3=new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        int c3;
        char[] ch1=new char[2];
        while ((c3=fr3.read(ch1))!=-1){
            System.out.print(c3+" ");
            //String str1=new String(ch1);
            String str1=new String(ch1,0,c3);
            System.out.println(str1);
        }
        fr3.close();
    }
}
