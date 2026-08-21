package com.itheima.wst.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IODemo18_PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw1=new PrintWriter(new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo4.txt"),true);
        pw1.println("hello world");         //自动刷新
        pw1.print("天下为公");
        pw1.println();
        pw1.printf("%s 爱上了 %s","阿珍","阿强");     //带有占位符
        pw1.close();
    }
}
