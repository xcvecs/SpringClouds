package com.example.cdspecification;

import java.util.ArrayList;
import java.util.List;

public class JavaBase {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        list.add("s5");

        List<String> stringList10 = change(list);
        List<String> stringList20 = change2(list);
        changeRef(list);


        changeRef(list);
        List<String> stringList21 = change2(list);
        List<String> stringList11 = change(list);


    }

    public static void changeRef(List<String> list) {
//        list=new ArrayList<>();
        list.set(0,"sss1");
//        String s = list.get(0);
//        s = "ssss1";
//        list.set(0, s);
//        list.set(0,"sss1");
    }

    public static List<String> change(List<String> list){
        list.set(0,"sss1");
        return list;
    }

    public static List<String> change2(List<String> list){
        list.set(0,"sss1");
        return list;
    }
}
