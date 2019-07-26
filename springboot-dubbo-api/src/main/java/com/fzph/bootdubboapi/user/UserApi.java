package com.fzph.bootdubboapi.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fzph.bootdubboserviceapi.user.User;
import com.fzph.bootdubboserviceapi.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Reference(version = "1.0.0")
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/all")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }
}
