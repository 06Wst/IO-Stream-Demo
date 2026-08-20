package com.itheima.wst.IO;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo13_FileWriter2 {
    public static void main(String[] args) throws IOException {
        FileWriter fr1=new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo7.txt");

        fr1.write(97);
        fr1.write(98);
        fr1.write(99);
        fr1.flush();               //刷新缓冲区
        fr1.write(100);

        fr1.close();
    }
}
