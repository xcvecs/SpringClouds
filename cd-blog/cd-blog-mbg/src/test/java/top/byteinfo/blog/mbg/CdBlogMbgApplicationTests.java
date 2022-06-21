package top.byteinfo.blog.mbg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.byteinfo.blog.mbg.entity.Article;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;

@SpringBootTest
class CdBlogMbgApplicationTests {

    @Test
    void contextLoads() {
//
//        Article article = new Article();
//        String s = article.toString();
//        System.out.println(s);
//
////        Field[] fields = Article.class.getDeclaredFields();
//        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\SpringClouds\\cd-blog\\cd-blog-mbg\\src\\main\\java\\top\\byteinfo\\blog\\mbg\\entity");
//
////        String[] list = file.list();
//        System.out.println();
//
//
//        createTable(Article.class, "tb", file);
//    }
//
//    void createTable(Class classname, String TablePrefix, File file) {
//        Field[] fields = classname.getDeclaredFields();
////        String[] beanNameList= file.list();
//
//        StringBuilder sbd = new StringBuilder();
//
//        String stateEnd = ";";
//        String space = " ";
//        String ai = "AUTO_INCREMENT";
////        for (String beanName : beanNameList) {
////            String tableName = beanName;
////            String s1 = "DROP TABLE IF EXISTS "+ beanName+stateEnd;
////            String s2 = "CREATE TABLE "+beanName+" (";
////
////
////            String S3 = "id  int NOT NULL AUTO_INCREMENT,";
////
////        }
//        String tableName = classname.getName();
//        String s1 = "DROP TABLE IF EXISTS " + tableName + stateEnd;
//        String s2 = "CREATE TABLE " + tableName + " (";
//        HashMap hashMap = new HashMap();
//        hashMap.put("java.lang.Integer", "int");
////        for (Field field : fields) {
////
////            hashMap.put("","");
////
////        }
//
////        for (int i = 0; i < fields.length; i++) {
////
/////
//////            if (fieldName.equals("id")) {
//////                String s31 = fieldName + space + hashMap.get(fieldType.getName()) + " NOT NULL" + ai + ",";
//////
//////            } else {
//////                String s31 = fieldName + space + hashMap.get(fieldType.getName()) + " NOT NULL" + ",";
//////
//////            }
////            System.out.println();
////        }
//        for (Field field : fields) {
//            Class<?> fieldType = field.getType();
//            String fieldName = field.getName();
//            String s31;
//            if (fieldName.equals("id")) {
//                 s31 = fieldName + space + hashMap.get(fieldType.getName()) + " NOT NULL " + ai + ",";
//
//            } else {
//                 s31 = fieldName + space + hashMap.get(fieldType.getName()) + " NOT NULL " + ",";
//
//            }
////            String s31 = fieldName + space + hashMap.get(fieldType.getName()) + " NOT NULL AUTO_INCREMENT,";
//            System.out.println();
//        }
//        String S3 = "id  int NOT NULL AUTO_INCREMENT,";
////        String s1 = "DROP TABLE IF EXISTS `tb_article`;";
//
    }

}
