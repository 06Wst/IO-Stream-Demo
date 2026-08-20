package com.itheima.wst.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo7 {
    public static void main(String[] args) throws IOException {
        //针对IO流的异常捕获
        //未来实际开发中都是抛出异常，spring框架会统一处理异常
        FileOutputStream fos1=null;                    //必须赋值，否则没有创建对象
        try {
            fos1=new FileOutputStream("D:\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
            fos1.write(new byte[]{97,98,99});
            //fos1.close();                      //如果这样捕获异常，会导致资源无法释放
        } catch (IOException e) {
            e.printStackTrace();
        } finally {                       //无论是否发生异常，都会执行，除非JVM退出
            if(fos1!=null){                //如果路径不存在，fos1为null，不能调用close方法，会空指针异常
                try {
                    fos1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("释放了资源");
        }

        System.out.println("程序结束");
        System.out.println("======================================");

        //jdk7 try with resources
        try (
                FileOutputStream fos2=new FileOutputStream("D:\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt")
        ) {
            fos2.write(new byte[]{97,98,99,100});
        }catch (IOException e) {
            e.printStackTrace();
        }

        //jdk9
        FileOutputStream fos3=new FileOutputStream("D:\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo1.txt");
        try (fos3) {
            fos3.write(new byte[]{97,98,99,100});
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}