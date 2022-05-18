package com.example.NotificationApi.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource(){
        DataSource dataSource = null;
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/notifications");
        builder.username("root");
        builder.password("root");
        builder.driverClassName("com.mysql.jdbc.Driver");
        dataSource = builder.build();
        return dataSource;
    }
}
