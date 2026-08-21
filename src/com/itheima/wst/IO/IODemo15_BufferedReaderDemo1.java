package com.itheima.wst.IO;

import java.io.*;

public class IODemo15_BufferedReaderDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br1=new BufferedReader(new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt"));
        String l1=br1.readLine();
        System.out.println(l1);
        br1.close();
        System.out.println("-----------------");

        BufferedReader br2=new BufferedReader(new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt"));
        String l2="";
        while ((l2=br2.readLine())!=null){         //读到末尾返回null
            System.out.println(l2);
        }
        br2.close();
        System.out.println("-----------------");

        BufferedWriter bw1=new BufferedWriter(new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt",true));
        bw1.newLine();                     //跨平台换行
        bw1.write("我");
        bw1.close();
    }
}
