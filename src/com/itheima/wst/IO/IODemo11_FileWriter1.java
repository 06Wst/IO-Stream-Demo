package com.itheima.wst.IO;

import java.io.*;

public class IODemo11_FileWriter1 {
    public static void main(String[] args) throws IOException {

        //此时传入大于一个字节，乱码
        FileOutputStream fos=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        //fos.write(25105);             //乱码
        fos.write("我".getBytes());         //不会乱码，因为虽然大于1字节，但是分成了多字节存入数组中，最终到文件中依然是完整数据
        fos.close();

        //int 不乱码
        FileWriter fw=new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        fw.write(25105);
        fw.close();

        //参数为字符串
        fw=new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        fw.write("我");
        fw.close();

        //参数为字符数组
        fw=new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        fw.write(new char[]{'我','好','好'});
        fw.close();
    }
}
