package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo6 {
    public static void main(String[] args) throws IOException {
        /*FileInputStream fis1=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        FileOutputStream fos1=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        int b;
        while ((b=fis1.read())!=-1){
            fos1.write(b);
        }
        fos1.close();
        fis1.close();*/

        FileInputStream fis2=new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        FileOutputStream fos2=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        int len;
        byte[] b=new byte[2];
        while ((len=fis2.read(b))!=-1){             //一次读取2字节
            System.out.print(len+" ");            //返回值为实际读取的字节数量
            String str=new String(b,0,len);             //将字节数组转换为字符串
            System.out.println(str);
            fos2.write(str.getBytes());
        }
        /*
        String str=new String(b);
        最后会输出空格是为什么：
        因为最后只读取到d，没有覆盖空格，所以空格保留
         */
        fos2.close();
        fis2.close();

    }
}
