package top.byteinfo.blog;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import top.byteinfo.blog.common.core.model.result.Result;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WebTest {


    @Autowired
    private MockMvc mockMvc;
    @Test
    @Ignore
    public void index() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("")).andExpect(MockMvcResultMatchers.status().isOk());


        Result<String>  result = new Result<>();
        Class<Result> resultClass = Result.class;

        List<Result<List<String>>> lists =new ArrayList<>();


    }

}
