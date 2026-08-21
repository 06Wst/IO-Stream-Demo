package com.itheima.wst.IO;

import java.io.*;

public class IOBufferTest3 {
    public static void main(String[] args) throws IOException {
        //统计程序运行次数
        BufferedReader br1=new BufferedReader(new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo9.txt"));
        int cnt=Integer.parseInt(br1.readLine());
        if(cnt<=3){
            System.out.println("欢迎使用本软件，你这是第"+cnt+"次使用本软件");
        }else{
            System.out.println("本软件只能免费使用三次，请充值后使用");
            return ;
        }
        String newcnt= String.valueOf(cnt+1);
        //必须写到下面，不然会清空存档
        BufferedWriter bw1=new BufferedWriter(new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo9.txt"));
        bw1.write(newcnt);
        bw1.close();
        br1.close();
    }
}
