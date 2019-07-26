package com.fzph.bootdubbouser.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.fzph.bootdubboserviceapi.user.User;
import com.fzph.bootdubboserviceapi.user.UserService;
import com.fzph.bootdubbouser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.selectList(null);
    }
}
