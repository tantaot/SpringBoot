package com.tantao.boot;


import com.tantao.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/*
*
* 主程序入口
* @SpringBootApplication:表示为一个springboot程序
* */

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
       /* boolean aa = run.containsBean("aa");
        System.out.println(aa);
        boolean bb = run.containsBean("bb");
        System.out.println(bb);*/

    }

}
