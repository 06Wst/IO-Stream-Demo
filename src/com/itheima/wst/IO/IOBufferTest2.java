package com.itheima.wst.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class IOBufferTest2 {
    public static void main(String[] args) throws IOException {
        //练习2：排序出师表
        /*BufferedReader br1=new BufferedReader(new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo8csb1.txt"));
        BufferedWriter bw1=new BufferedWriter(new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo8csb2.txt"));
        String line1;
        ArrayList<String> l1=new ArrayList<>();
        while ((line1=br1.readLine())!=null){
            l1.add(line1);
        }
        Collections.sort(l1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1=Integer.parseInt(o1.split("\\.")[0]);          //通用性更好
                int i2=Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });
        for (String i : l1) {
            bw1.write(i);
            bw1.newLine();
        }
        bw1.close();
        br1.close();*/

        //写法2：流
        BufferedReader br2=new BufferedReader(new FileReader("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo8csb1.txt"));
        BufferedWriter bw2 =new BufferedWriter(new FileWriter("D:\\work space\\IODemo\\src\\com\\itheima\\wst\\IO\\fileDemo\\Demo8csb2.txt"));
        String line2;
        TreeMap<Integer,String> t=new TreeMap<>();         //自动排序
        while ((line2=br2.readLine())!=null){
            t.put(Integer.parseInt(line2.split("\\.")[0]),line2);
        }

        for (String i : t.values()) {
            bw2.write(i);
            bw2.newLine();
        }
        bw2.close();
        br2.close();

    }
}
