package com.itheima.wst.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos1=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt");
        fos1.write(new byte[]{97,98,99,100,101});
        fos1.close();

        //第二种
        FileOutputStream fos2=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt");
        fos2.write(new byte[]{97,98,99,100,101});
        fos2.close();

        //第三种
        FileOutputStream fos3=new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo3.txt");
        fos3.write(new byte[]{97,98,99,100,101},2,2);
        fos3.close();
    }
}
