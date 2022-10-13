package com.chenp.spring5.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author chenpi
 * @create 2022-10-13 22:01
 */
@Configuration
@ComponentScan("com.chenp.spring5")
public class SpringConfig {

    //数据库连接池
    @Bean(name = "dataSource")
    public DruidDataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://150.158.162.234:3306/user_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("310012");
        return druidDataSource;

    }

    //JdbcTemplate 对象
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(DruidDataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
