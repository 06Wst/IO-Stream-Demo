package com.itheima.wst.IO;

import java.io.*;

public class IOBufferTest1 {
    public static void main(String[] args) throws IOException {
        //练习1：四种拷贝文件，并统计用时

        //1
        FileInputStream fis1=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt");
        FileOutputStream fos1=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        byte[] b1=new byte[1024];
        int len;
        long st1=System.currentTimeMillis();
        while ((len=fis1.read(b1))!=-1){
            fos1.write(b1,0,len);
        }
        long et1=System.currentTimeMillis();
        System.out.println("1号方法用时："+(et1-st1)+"ms");
        fis1.close();
        fos1.close();
        System.out.println("-----------------");

        //2
        BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt"));
        BufferedOutputStream bos1=new BufferedOutputStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt"));
        byte[] b2=new byte[1024];
        int len1;
        long st2=System.currentTimeMillis();
        while ((len1=bis1.read(b2))!=-1){
            bos1.write(b2,0,len1);
        }
        long et2=System.currentTimeMillis();
        System.out.println("2号方法用时："+(et2-st2)+"ms");
        bis1.close();
        bos1.close();


    }
}
