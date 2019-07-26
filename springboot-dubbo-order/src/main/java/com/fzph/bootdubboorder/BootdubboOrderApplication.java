package com.fzph.bootdubboorder;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.fzph.bootdubboorder.mapper")
public class BootdubboOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootdubboOrderApplication.class, args);
    }

}
