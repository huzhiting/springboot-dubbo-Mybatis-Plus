package com.fzph.bootdubbouser;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.fzph.bootdubbouser.mapper")
public class BootdubboUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootdubboUserApplication.class, args);
    }

}
