package top.byteinfo.cd.blogx;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.byteinfo.cd.blogx.dao.AdminDao;
import top.byteinfo.cd.blogx.domain.Admin;

import java.util.List;

@SpringBootTest
class CdBlogXApplicationTests {

//    @Autowired
//    UserDao userDao;

    @Autowired
    AdminDao adminDao;

    @Test
    void contextLoads() {
        System.out.println();
        LambdaQueryWrapper<Admin> lambda = new QueryWrapper<Admin>().lambda();
        List<Admin> users = adminDao.selectList(lambda);

    }

}
