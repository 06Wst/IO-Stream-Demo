package com.itheima.wst.IO;

import java.io.*;

public class IOTest1 {
    public static void main(String[] args) throws IOException {
        //练习1：拷贝文件夹
        File src=new File("C:\\Users\\Legion\\Desktop\\image\\aaa");
        File dest=new File("C:\\Users\\Legion\\Desktop\\image\\dest");

        copyf(src,dest);

    }

    private static void copyf(File src,File dest) throws IOException {
        dest.mkdirs();             //创建目标文件夹
        File[] fs= src.listFiles();
        for (File i : fs) {
            if(i.isFile()){
                FileInputStream fis=new FileInputStream(i);
                FileOutputStream fos=new FileOutputStream(new File(dest,i.getName()));        //getname获取文件名
                byte[] b=new byte[1024];
                int len;
                while ((len=fis.read(b))!=-1){
                    fos.write(b,0,len);
                }
                fos.close();
                fis.close();
            }else{
                copyf(i,new File(dest,i.getName()));
            }
        }
    }
}
