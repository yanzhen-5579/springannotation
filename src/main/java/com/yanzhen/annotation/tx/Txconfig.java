package com.yanzhen.annotation.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan("com.yanzhen.annotation.tx")
@EnableTransactionManagement
/**
 * @EnableTransactionManagement会通过TransactionManagementConfigurationSelector这个给容器导入组件
 *导入两个组件
 * AutoProxyRegistrar（是一个后置处理器）：给容器中导入InfrastructureAdvisorAutoProxyCreator组件
 * ProxyTransactionManagementConfiguration：给容器导入事务增强器，事务增强器要用到事务注解的信息，就需要AnnotationTransactionAttributeSource解析注解信息
 *                                          给容器注入事务拦截器TransactionInterceptor：保存了事务属性信息，事务管理器
 *                                              TransactionInterceptor是一个方法拦截器
 *
 */
public class Txconfig {
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("123");
        return dataSource;
    }


    //spring对于@configuration的处理都是找组件，并不是执行方法
    @Bean
    public JdbcTemplate jdbcTemplate() throws  Exception{
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager()throws Exception{
        return new DataSourceTransactionManager(dataSource());
    }

}
