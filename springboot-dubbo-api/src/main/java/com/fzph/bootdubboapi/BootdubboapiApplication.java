package com.fzph.bootdubboapi;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDubboConfiguration
public class BootdubboapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootdubboapiApplication.class, args);
    }

}
