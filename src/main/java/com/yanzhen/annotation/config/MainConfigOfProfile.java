package com.yanzhen.annotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


//加在类上的话表示只有在指定的环境下 这个类才会生效
@Profile("test")
@PropertySource("classpath:/db.properties")
@Configuration
public class MainConfigOfProfile {

    @Value("${jdbc.user}")
    String user;

    @Profile("test")
    @Bean("testDatSource")
    public DataSource dataSourceTest(@Value("${jdbc.password}") String pass) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pass);
        dataSource.setJdbcUrl("jdbc:/mysql://localhost:3306/test");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }
    @Profile("dev")
    @Bean("devDatSource")
    public DataSource dataSourceDev(@Value("${jdbc.password}") String pass) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pass);
        dataSource.setJdbcUrl("jdbc:/mysql://localhost:3306/test");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }
    @Profile("prod")
    @Bean("prodDatSource")
    public DataSource dataSourcePro(@Value("${jdbc.password}") String pass) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword(pass);
        dataSource.setJdbcUrl("jdbc:/mysql://localhost:3306/test");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
