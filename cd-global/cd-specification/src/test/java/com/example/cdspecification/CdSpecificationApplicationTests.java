package com.example.cdspecification;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CdSpecificationApplicationTests {
    static {

    }

    @AllArgsConstructor
    class CollectionImpl {
        List<String> list;
    }

    @Test
    void contextLoads() {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        list.add("s5");



        System.out.println(list.get(0));
        contextLoads1(list);
        System.out.println(list.get(0));


    }

    void t1(List<String> list) {
        list.set(0, "ss1");
    }

    void t2(List<String> list) {
        System.out.println(list.get(0));
    }

    void test1(CollectionImpl collection) {
        collection.list.set(0, "sssss1");
    }


    @Test
    void contextLoads1(List<String> list ){
        System.out.println(list.get(0));
        list.set(0, "ss1");
        System.out.println(list.get(0));
    }


}
