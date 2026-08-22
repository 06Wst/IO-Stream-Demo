package com.itheima.wst.IO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IODemo19_ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File src=new File("C:\\Users\\Legion\\Desktop\\image\\下载.jpg");
        File dest=new File("C:\\Users\\Legion\\Desktop\\image");
        toZip(src,dest);
    }

    public static void toZip(File src,File dest) throws IOException {
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        ZipEntry ze=new ZipEntry("a.jpg");
        zos.putNextEntry(ze);
        FileInputStream fis=new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
