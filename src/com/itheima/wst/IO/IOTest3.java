package com.itheima.wst.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IOTest3 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\Legion\\Desktop\\image\\b\\bbb.txt");
        FileReader fr1=new FileReader(f1);
        StringBuilder sb=new StringBuilder();
        int len;
        while ((len=fr1.read())!=-1){
            sb.append((char)len);
        }
        fr1.close();

        /*ArrayList<Integer> l=new ArrayList<>();
        String []s=sb.toString().split("-");
        for (String i : s) {
            l.add(Integer.parseInt(i));
        }
        l.sort((o1,o2)->o1-o2);*/

        Integer[] l=Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        FileWriter fw=new FileWriter(f1,true);
        fw.write("\n");
        /*for (Integer i : l) {
            fw.write(i.toString()+"-");
        }*/
        fw.write(
                Arrays.toString(l).replace("[","").replace("]","").replace(",","-")
        );
        fw.close();
    }
}
