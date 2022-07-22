package top.byteinfo.blog.websocket;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.InputStream;
import java.util.*;

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

    @SneakyThrows
    @Test
    void Test(){
        System.out.println();

        File executable = new File("C:\\Users\\iec\\Desktop\\run.exe\\run\\run.exe");
        List<String> commands = new ArrayList<>();
        commands.add("cmd.exe");
        commands.add("/c");
        commands.add("run.exe");

        ProcessBuilder pb = new ProcessBuilder(commands);
        pb.directory(new File("C:\\Intel\\run"));
        Process process = pb.start();
        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[128];
        int read = inputStream.read(bytes);
        String s = new String(bytes);

        pb.directory(executable.getParentFile());

    }

}
