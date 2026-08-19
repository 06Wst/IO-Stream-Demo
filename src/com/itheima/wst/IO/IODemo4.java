package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo4.txt");
        int res1=fis1.read();             //读不到了，返回-1
        System.out.println(res1);
        fis1.close();
    }
}
