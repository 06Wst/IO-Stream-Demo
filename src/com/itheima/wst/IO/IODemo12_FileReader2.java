package com.itheima.wst.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IODemo12_FileReader2 {
    public static void main(String[] args) throws IOException {
        FileReader fr1=new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt");

        int c1=fr1.read();
        System.out.println((char)c1);

        int c2=fr1.read();
        System.out.println((char)c2);

        int c3=fr1.read();
        System.out.println((char)c3);

        int c4=fr1.read();
        System.out.println((char)c4);

        fr1.close();
    }
}
