package com.itheima.wst.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class IODemo19_ZipStreamDemo1 {
    public static void main(String[] args) throws Exception {

        File src=new File("C:\\Users\\Legion\\Desktop\\image\\aa.zip");
        File dest=new File("C:\\Users\\Legion\\Desktop\\image");
        unzip(src,dest);

    }

    public static void unzip(File src,File dest)throws Exception{
        ZipInputStream zis1=new ZipInputStream(new FileInputStream(src));
        //能自动获取到所有文件，包括子目录中的文件，全读完返回null
        /*for (int i=0;i<100;i++){
            ZipEntry ze=zis1.getNextEntry();
            System.out.println(ze);
        }*/

        ZipEntry ze;
        while ((ze=zis1.getNextEntry())!=null){
            System.out.println(ze);
            if(ze.isDirectory()){
                File f= new File(dest,ze.toString());
                f.mkdirs();        //创建文件夹
            }else{
                FileOutputStream fos=new FileOutputStream(new File(dest,ze.toString()));
                int b=0;
                while ((b=zis1.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                //zis1.closeEntry();           //1 位置错误
            }
            zis1.closeEntry();        //2
        }
    }
}
