package com.itheima.wst.IO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IODemo20_commonsDemo1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件
        File src=new File("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo11.txt");
        File dest=new File("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo5.txt");
        FileUtils.copyFile(src,dest);

        //拷贝文件夹
        File src1=new File("C:\\Users\\Legion\\Desktop\\image\\b");
        File dest1=new File("C:\\Users\\Legion\\Desktop\\image\\dest");
        FileUtils.copyDirectory(src1,dest1);         //拷贝文件夹内容
        FileUtils.copyDirectoryToDirectory(src1,dest1);         //拷贝整个文件夹

        //删除文件夹
        FileUtils.deleteDirectory(dest1);
        //清空文件夹内容
        FileUtils.cleanDirectory(new File("C:\\Users\\Legion\\Desktop\\image\\aa"));


    }
}
