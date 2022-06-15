package com.tantao.boot.config;

import com.tantao.boot.bean.Car;
import com.tantao.boot.bean.Pet;
import com.tantao.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = "classpath:bean.xml")//导入配置文件
@Import(value = {User.class})//导入组件
@Configuration //表示这是一个配置类
@EnableConfigurationProperties(Car.class)
/*
* 1、开启car的配置绑定功能
* 2、把car这个组件注册到容器中
* */
public class MyConfig {


    @ConditionalOnBean(name = "tom")
    @Bean
    public User user(){
        return new User("张三",pet());
    }


    @Bean(value = "tom")
    public Pet pet(){
        return new Pet("tom",10.00);
    }



}
