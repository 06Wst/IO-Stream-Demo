package com.itheima.wst.IO;

import com.itheima.wst.IO.entity.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IODemo17_ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        Student s1=new Student("张三","北京",18);           //该类必须实现Serializable接口
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo9.txt"));
        oos1.writeObject(s1);
        oos1.close();
    }
}
