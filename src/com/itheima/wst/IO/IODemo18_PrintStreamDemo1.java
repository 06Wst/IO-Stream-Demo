package com.itheima.wst.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class IODemo18_PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps1=new PrintStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo2.txt"),true, Charset.forName("UTF-8"));
        ps1.println("你好");          //完全一致
        ps1.print("hello");
        ps1.println();
        ps1.printf("%s 爱上了 %s","阿珍","阿强");     //带有占位符
        ps1.close();
    }
}
