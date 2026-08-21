package com.itheima.wst.IO;

import com.itheima.wst.IO.entity.Student2;

import java.io.*;
import java.util.ArrayList;

public class IODemo17_ObjectOutputStreamTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //该写法无法确定存在多少对象
        /*Student2 stu1=new Student2("张三",18,"北京");
        Student2 stu2=new Student2("李四",19,"上海");
        Student2 stu3=new Student2("王五",20,"广州");
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo10test.txt"));
        oos1.writeObject(stu1);
        oos1.writeObject(stu2);
        oos1.writeObject(stu3);
        oos1.close();

        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo10test.txt"));
        Student2 stu4=(Student2)ois1.readObject();
        System.out.println(stu4);
        Student2 stu5=(Student2)ois1.readObject();
        System.out.println(stu5);
        Student2 stu6=(Student2)ois1.readObject();
        System.out.println(stu6);
        Student2 stu7=(Student2)ois1.readObject();            //异常
        System.out.println(stu7);
        System.out.println();
        ois1.close();*/

        //推荐写法：使用集合，只需要序列化一次，反序列化一次
        Student2 stu1=new Student2("张三",18,"北京");
        Student2 stu2=new Student2("李四",19,"上海");
        Student2 stu3=new Student2("王五",20,"广州");
        ArrayList<Student2> l1=new ArrayList<>();              //直接传入集合
        l1.add(stu1);
        l1.add(stu2);
        l1.add(stu3);
        ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo10test.txt"));
        oos2.writeObject(l1);
        oos2.close();

        ArrayList<Student2> res=new ArrayList<>();
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo10test.txt"));
        res=(ArrayList<Student2>)ois2.readObject();
        System.out.println(res);
        ois2.close();
    }
}
