package top.byteinfo.cdblogsearch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CdBlogSearchApplicationTests {

    //    @Autowired
//    UserRepository userRepository;

FactoryBean factoryBean;


    @Test
    void contextLoads() {

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
