package com.itheima.wst.IO;

import java.io.*;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IODemo19_ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src=new File("C:\\Users\\Legion\\Desktop\\image\\aaa");
        File destParent=src.getParentFile();                    //压缩包父级路径
        File dest=new File(destParent,src.getName()+".zip");           //压缩包路径
        System.out.println(dest);

        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));

        toZip(src,zos,src.getName());           //传入路径
        zos.close();
    }

    private static void toZip(File src,ZipOutputStream zos,String path)  throws IOException {
        //FileInputStream fis=new FileInputStream(src);
        File[] fs=src.listFiles();
        if (fs!=null) {
            for (File i : fs) {
                System.out.println("正在处理");
                if(i.isFile()){
                    ZipEntry ze=new ZipEntry(path+"\\"+i.getName());        //条目的路径？压缩包内部路径
                    System.out.println(ze);
                    zos.putNextEntry(ze);
                    FileInputStream fis=new FileInputStream(i);
                    int b;
                    while ((b=fis.read())!=-1){
                        zos.write(b);
                    }
                    fis.close();
                    zos.closeEntry();
                }else{
                    toZip(i,zos,path+"\\"+i.getName());
                }
            }
        }
    }
}
