package com.itheima.wst.IO;

import java.io.*;

public class IOTest2 {
    public static void main(String[] args) throws IOException {
        //练习2：文件加密
        File f1=new File("C:\\Users\\Legion\\Desktop\\image\\b\\true.txt");
        File f2=new File("C:\\Users\\Legion\\Desktop\\image\\b\\fake.txt");
        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos1=new FileOutputStream(f2);
        int n=10;
        int len;
        while ((len=fis1.read())!=-1){
            fos1.write(len ^ n);
        }
        fis1.close();
        fos1.close();

        //解密
        File f3=new File("C:\\Users\\Legion\\Desktop\\image\\b\\true2.txt");
        FileInputStream fis2=new FileInputStream(f2);
        FileOutputStream fos2=new FileOutputStream(f3);
        int len2;
        while ((len2=fis2.read())!=-1){
            fos2.write(len2 ^ n);
        }
        fis2.close();
        fos2.close();
    }
}
