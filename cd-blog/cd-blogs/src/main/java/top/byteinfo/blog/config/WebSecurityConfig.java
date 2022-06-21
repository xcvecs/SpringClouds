//package top.byteinfo.x.blog.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    /**
//     * 密码加密
//     *
//     * @return {@link PasswordEncoder} 加密方式
//     */
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    /**
//     * 配置权限
//     *
//     * @param http http
//     * @throws Exception 异常
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 配置登录注销路径
//        http.formLogin()
//                .loginProcessingUrl("/login")
//                .successHandler(authenticationSuccessHandler)
//                .failureHandler(authenticationFailHandler)
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessHandler(logoutSuccessHandler);
//        // 配置路由权限信息
//        http.authorizeRequests()
//                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
//                    @Override
//                    public <O extends FilterSecurityInterceptor> O postProcess(O fsi) {
//                        fsi.setSecurityMetadataSource(securityMetadataSource());
//                        fsi.setAccessDecisionManager(accessDecisionManager());
//                        return fsi;
//                    }
//                })
//                .anyRequest().permitAll()
//                .and()
//                .sessionManagement()
//                .maximumSessions(20)
//                .sessionRegistry(sessionRegistry());
//    }
//
//}
