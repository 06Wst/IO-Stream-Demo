package com.itheima.wst.IO;

import com.itheima.wst.IO.entity.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IODemo17_ObjectInputStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo9.txt")) ;
        Student o = (Student) ois1.readObject();             //需要强制类型转换
        System.out.println(o);
        /*
        瞬态关键字，不参与序列化，所以反序列化后，瞬态关键字的值为null
         */
        ois1.close();
    }
}
