package top.byteinfo.blog.util.austin;

import java.util.Collections;
import java.util.Map;

public class CollectionUtil {

    public class MessageParam {


        private String receiver;

        private Map<String, String> variables;

        private Map<String, String> extra;
    }

    public void t1(String[] args) {
        Collections.singletonList(new MessageParam());
    }
}
