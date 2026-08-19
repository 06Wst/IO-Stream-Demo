package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        FileOutputStream fos1=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        int b;
        while ((b=fis1.read())!=-1){
            fos1.write(b);
        }
        fos1.close();
        fis1.close();
    }
}
