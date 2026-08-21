package com.itheima.wst.IO;

import java.io.*;
import java.nio.charset.Charset;

public class IODemo16_ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //使用字节流一行一行读取文件
        //解决问题1：中文乱码
        InputStreamReader isr1=new InputStreamReader(new FileInputStream("C:\\Users\\Legion\\Desktop\\image\\utf-8.txt"));
        //解决问题2：读取一行的方法问题
        BufferedReader br1=new BufferedReader(isr1);
        String line1=br1.readLine();
        System.out.println(line1);
        br1.close();
        //isr1.close();           //自动关闭

        //简化
        BufferedReader br2=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Legion\\Desktop\\image\\utf-8.txt")));
        String line2=br2.readLine();
        System.out.println(line2);
        br2.close();                 //自动关闭
    }
}
