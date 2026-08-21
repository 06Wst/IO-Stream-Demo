package com.itheima.wst.IO.entity;

import java.io.Serial;
import java.io.Serializable;

public class Student2 implements Serializable {
    @Serial
    private static final long serialVersionUID = 322258691701863166L;
    private String name;
    private int age;
    private String address;            //瞬态关键字，不参与序列化

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
