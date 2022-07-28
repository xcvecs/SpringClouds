//package top.byteinfo.cd.blogx.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourcesConfig {
//
//    @Primary
//    @Bean(name ="H1")
////    @ConfigurationProperties("spring.datasource.hikari.h1")
//    public DataSource first() {
//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setJdbcUrl("jdbc:mysql://192.168.1.11/entitys?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
//        hikariDataSource.setUsername("root");
//        hikariDataSource.setPassword("root");
//        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        return hikariDataSource;
//    }
//
//    @Primary
//    @Bean(name ="H2")
////    @ConfigurationProperties("spring.datasource.hikari.h1")
//    public DataSource second() {
//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost/entity?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
//        hikariDataSource.setUsername("root");
//        hikariDataSource.setPassword("root");
//        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        return hikariDataSource;
//    }
//}
