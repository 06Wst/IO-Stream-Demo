package com.itheima.wst.IO;

import java.io.*;
import java.nio.charset.Charset;

public class IODemo16_ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //指定字符集读写
        //读
        //淘汰方式
        InputStreamReader isr=new InputStreamReader(new FileInputStream("C:\\Users\\Legion\\Desktop\\image\\gbk.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();
        System.out.println();

        //推荐方式
        FileReader fr=new FileReader("C:\\Users\\Legion\\Desktop\\image\\gbk.txt", Charset.forName("GBK"));       //推荐
        int ch1;
        while ((ch1=fr.read())!=-1){
            System.out.print((char)ch1);
        }
        fr.close();

        //写
        //淘汰方式
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("C:\\Users\\Legion\\Desktop\\image\\gbk.txt",true),"UTF-8");
        osw.write("嘿嘿");             //乱码
        osw.close();

        //推荐方式
        FileWriter fr1=new FileWriter("C:\\Users\\Legion\\Desktop\\image\\gbk.txt",Charset.forName("GBK"));
        fr1.write("嘿嘿");
        fr1.close();

        //练习：转文件编码
        FileReader fr2=new FileReader("C:\\Users\\Legion\\Desktop\\image\\gbk.txt",Charset.forName("GBK"));
        BufferedWriter bw2=new BufferedWriter(new FileWriter("C:\\Users\\Legion\\Desktop\\image\\utf-8.txt",Charset.forName("UTF-8")));
        int ch2;
        while ((ch2=fr2.read())!=-1){
            bw2.write(ch2);
        }
        fr2.close();
        bw2.close();
    }
}
