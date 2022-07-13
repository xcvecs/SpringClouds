package top.byteinfo.blog.websocket;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

@SpringBootTest
class CdBlogWebsocketApplicationTests {

    public static int temp;

    @Test
    void contextLoads() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Random random = new Random();
        int[] ints = random.ints(10, 1, 10).distinct().limit(10).sorted().toArray();
        System.out.println(Arrays.toString(ints));


        for (int anInt : ints) {
            linkedList.add(anInt);
            arrayDeque.add(anInt);
        }
//        System.out.println(linkedList);
//        Integer first = linkedList.getFirst();
//        Integer integer = linkedList.peekFirst();
//        linkedList.removeFirst();
//        Integer peekLast = linkedList.peekLast();
//        linkedList.removeLast();

        System.out.println(arrayDeque);
        Integer pop = arrayDeque.pop();
        if (!arrayDeque.isEmpty()) {
            temp = arrayDeque.pop();
        }

        arrayDeque.add(11);


    }

}
