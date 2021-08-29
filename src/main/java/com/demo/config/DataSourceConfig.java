package com.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "rlsDb")
    @ConfigurationProperties(prefix = "spring.rls.datasource")
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "rlsJdbcTemplate")
    public JdbcTemplate jdbcTemplate1(@Qualifier("rlsDb") DataSource ds) {
        return new JdbcTemplate(ds);
    }

    @Bean(name = "wfiDb")
    @ConfigurationProperties(prefix = "spring.wfi.datasource")
    public DataSource dataSource2() {
        return  DataSourceBuilder.create().build();
    }

    @Bean(name = "wfiJdbcTemplate")
    public JdbcTemplate jdbcTemplate2(@Qualifier("wfiDb") DataSource ds) {
        return new JdbcTemplate(ds);
    }

}
