package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo5 {
    public static void main(String[] args) throws IOException {
        //循环读取
        FileInputStream fis1=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        int b;
        while ((b=fis1.read())!=-1){              //只要没读到末尾，就一直读入
            System.out.print((char) b);
        }
        System.out.println();
    }
}
