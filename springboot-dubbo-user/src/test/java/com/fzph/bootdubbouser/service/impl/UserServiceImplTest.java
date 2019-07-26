package com.fzph.bootdubbouser.service.impl;

import com.fzph.bootdubboserviceapi.user.User;
import com.fzph.bootdubboserviceapi.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.fzph.bootdubbouser.mapper")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAllUsers() {
        List<User> userList=userService.findAllUsers();
        if (userList != null) {
            for (User user : userList) {
                System.out.println(user.getId() + "；" + user.getName());
            }
        }
    }
}