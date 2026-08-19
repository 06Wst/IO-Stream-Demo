package com.itheima.wst.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
        //快速写
        FileOutputStream fos1=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt");
        String str1="hello world";
        byte[] b1=str1.getBytes();
        fos1.write(b1);          //将字符串转换为字节数组，再写入文件
        fos1.close();

        //换行
        FileOutputStream fos2=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt");
        String str2="66666";
        String wrap="\r\n";                //win 回车+换行   linux  \n   mac  \r
        String str3="hello world";
        fos2.write((str2+wrap+str3).getBytes());          //将字符串转换为字节数组，再写入文件
        fos2.close();

        //续写
        FileOutputStream fos3=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt",true);
        String str4="\nnihao";
        fos3.write(str4.getBytes());
        fos3.close();

    }
}
