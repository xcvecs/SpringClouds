package top.byteinfo.blog.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DruidDataSourceConfig {
    @Primary
    @Bean(name = "Druid1")
    @ConfigurationProperties("spring.datasource.druid.druid1")
    public DataSource first() {
        DruidDataSourceBuilder druidDataSourceBuilder = DruidDataSourceBuilder.create();

        DruidDataSource druidDataSource = druidDataSourceBuilder.build();
        System.out.println();
        return druidDataSource;
    }

    @Bean(name = "Druid2")
    @ConfigurationProperties("spring.datasource.druid.druid2")
    public DataSource second() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "Druid3")
    @ConfigurationProperties("spring.datasource.druid.druid3")
    public DataSource third() {
        return DruidDataSourceBuilder.create().build();
    }
}
