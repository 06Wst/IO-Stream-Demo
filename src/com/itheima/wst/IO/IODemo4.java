package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo4 {
    public static void main(String[] args) throws IOException {

        //使用引入
        FileInputStream fis1=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo4.txt");
        int res1=fis1.read();             //读不到了，返回-1
        System.out.println(res1);
        fis1.close();

        //读取不存在的文件，直接报错
        /*FileInputStream fis2=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo0.txt");
        int res2=fis2.read();
        System.out.println(res2);
        fis2.close();*/


    }
}
