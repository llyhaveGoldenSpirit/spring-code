package com.lly.config;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;

@AutoConfiguration//表明当前类是一个自动配置类
public class MybatisAutoConfig {

    /**
     * SqlSessionFactoryBean
     * @param dataSource 导入jdbc起步依赖时自动注入的
     * @return
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    /**
     * MapperScannerConfigure
     * @param beanFactory
     * @return
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //扫描的包：启动类所在的包及其子包
        //springboot的核心启动依赖提供了对应的api
        List<String> packages = AutoConfigurationPackages.get(beanFactory);
        String p = packages.get(0);
        mapperScannerConfigurer.setBasePackage(p);

        //扫描的注解
        mapperScannerConfigurer.setAnnotationClass(Mapper.class);

        return mapperScannerConfigurer;
    }


}
