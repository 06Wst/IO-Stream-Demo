package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo6.txt");
        int len;
        while ((len=fis.read())!=-1){
            System.out.print((char)len);            //出现乱码
        }
        fis.close();

        //拷贝文件不乱码
        FileInputStream fis2=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo6.txt");
        FileOutputStream fos=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo6_copy.txt");
        byte[] b=new byte[4];
        int len1;
        while((len1=fis2.read(b))!=-1){
            fos.write(b,0,len1);
        }
        fos.close();
        fis2.close();
    }
}
