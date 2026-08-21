package com.itheima.wst.IO;

import java.io.*;

public class IODemo14_BufferedInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt"));
        BufferedOutputStream bos1=new BufferedOutputStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt"));
        int b=0;
        while ((b=bis1.read())!=-1){
            bos1.write(b);
        }
        //帮助关闭基本流了
        bis1.close();
        bos1.close();

        //循环读入
        BufferedInputStream bis2=new BufferedInputStream(new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt"));
        BufferedOutputStream bos2=new BufferedOutputStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt"));
        byte[] bs=new byte[1024];
        int len=0;
        while ((len=bis2.read(bs))!=-1){
            System.out.println(len);
            bos2.write(bs,0,len);
            System.out.println(new String(bs,0,len));
        }
        bis2.close();
        bos2.close();
    }
}
