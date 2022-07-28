package top.byteinfo.cdblogsearch;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.byteinfo.cdblogsearch.mbg.admin.entity.Admin;
import top.byteinfo.cdblogsearch.mbg.admin.mapper.AdminMapper;
import top.byteinfo.cdblogsearch.mbg.user.entity.User;
import top.byteinfo.cdblogsearch.mbg.user.mapper.UserMapper;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CdBlogSearchApplicationTests {

    //    @Autowired
//    UserRepository userRepository;


    @Autowired
    UserMapper userMapper;
    @Autowired
    AdminMapper adminMapper;

    @Test
    void contextLoads() {
        System.out.println();
        List<User> userList = userMapper.selectAll();
        LambdaQueryWrapper<User> select = Wrappers.lambdaQuery(User.class).last("limit 5");
        List<User> users = userMapper.selectList(select);

        System.out.println();
        List<Admin> admins = adminMapper.selectAll();
        System.out.println();
    }


    class OAuth2AccessToken {

    }

    class TokenRequest {

    }

    public interface TokenGranter {
        OAuth2AccessToken grant(String grantType, TokenRequest tokenRequest);

    }

    // 统一入口：
    public class CompositeTokenGranter implements TokenGranter {

        private final List<TokenGranter> tokenGranters;

        public CompositeTokenGranter(List<TokenGranter> tokenGranters) {
            this.tokenGranters = new ArrayList<TokenGranter>(tokenGranters);
        }

        public OAuth2AccessToken grant(String grantType, TokenRequest tokenRequest) {
            for (TokenGranter granter : tokenGranters) {
                OAuth2AccessToken grant = granter.grant(grantType, tokenRequest);
                if (grant != null) {//出口
                    return grant;
                }
            }
            return null;
        }

        public void addTokenGranter(TokenGranter tokenGranter) {
            if (tokenGranter == null) {
                throw new IllegalArgumentException("Token granter is null");
            }
            tokenGranters.add(tokenGranter);
        }

    }

    abstract class AbstractTokenGranter implements TokenGranter {

        // authenticate code

        @Override
        public OAuth2AccessToken grant(String grantType, TokenRequest tokenRequest) {

            //access code by  grantType,tokenRequest

            return null;
        }
    }


    class ClientCredentialsTokenGranter extends AbstractTokenGranter {
        @Override
        public OAuth2AccessToken grant(String grantType, TokenRequest tokenRequest) {

            OAuth2AccessToken token = super.grant(grantType, tokenRequest);


            return token;
        }
    }

}
