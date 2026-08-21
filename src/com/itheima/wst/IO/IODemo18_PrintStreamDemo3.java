package com.itheima.wst.IO;

import java.io.PrintStream;

public class IODemo18_PrintStreamDemo3 {
    public static void main(String[] args) {
        /*
        底层是  public static final PrintStream out = null;
         */
        PrintStream ps=System.out;
        ps.println("hello world");
        //等于System.out.println("hello world");
        ps.close();

        System.out.println("hello world");           //关闭了，打印不了
    }
}
