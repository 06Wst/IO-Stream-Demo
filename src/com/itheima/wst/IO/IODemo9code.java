package com.itheima.wst.IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IODemo9code {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String strs1="你好";
        byte[] b1=strs1.getBytes();             //无参，默认使用UTF-8编码
        System.out.println(Arrays.toString(b1));

        byte[] b2=strs1.getBytes("GBK");          //有参，指定编码为GBK
        System.out.println(Arrays.toString(b2));

        //解码
        String res1=new String(b1);
        System.out.println(res1);
        System.out.println(new String(b1,"GBK"));          //不一致，乱码

        String res2=new String(b2,"GBK");
        System.out.println(res2);
    }
}
