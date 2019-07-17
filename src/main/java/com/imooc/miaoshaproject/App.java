package com.imooc.miaoshaproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.miaoshaproject.dao.UserDOMapper;
import com.imooc.miaoshaproject.dataobject.UserDO;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.imooc.miaoshaproject"})
@MapperScan("com.imooc.miaoshaproject.dao")
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }

    // HTTP 协议  --ETag 比对机制
    @Bean
    public ShallowEtagHeaderFilter shallowEtagHeaderFilter(){
        return  new ShallowEtagHeaderFilter();
    }
}
