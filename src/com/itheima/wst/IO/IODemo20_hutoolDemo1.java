package com.itheima.wst.IO;

import cn.hutool.*;
import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IODemo20_hutoolDemo1 {
    public static void main(String[] args) {
        File f1= FileUtil.file("C:\\Users\\Legion\\Desktop\\image\\aa","bbb","ccc","a.txt");
        System.out.println(f1);

        //根据路径创建文件，如果路径不存在，会创建所有不存在的目录
        FileUtil.touch(f1);

        //写入文件
        ArrayList<String> l1=new ArrayList<>();
        Collections.addAll(l1,"aaa","bbb","ccc");
        File f3= FileUtil.writeLines(l1,f1, Charset.forName("UTF-8"));
        System.out.println(f3);

        //读取文件
        List<String> l2 = FileUtil.readLines(f1, Charset.forName("UTF-8"));
        System.out.println(l2);
    }
}
