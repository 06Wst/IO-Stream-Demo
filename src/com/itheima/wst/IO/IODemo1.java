package com.itheima.wst.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {

        //创建流对象，需要异常处理，参数为处理文件的路径
        FileOutputStream fos1=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        fos1.write(12);
        fos1.close();             //释放资源

        //如果文件不存在
        FileOutputStream fos2=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo2.txt");
        fos2.write(123);
        fos2.close();             //释放资源

        //如果父级不存在，报错
        /*FileOutputStream fos3=new FileOutputStream("D:\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo2.txt");
        fos1.write(123);
        fos1.close();             //释放资源*/

        //如果存在，会清空
        FileOutputStream fos4=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt");
        fos4.write(123);
        fos4.close();             //释放资源

    }
}
