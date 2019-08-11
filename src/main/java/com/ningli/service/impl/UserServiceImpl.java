package com.ningli.service.impl;

import com.github.pagehelper.Page;
import com.ningli.mapper.UserMapper;
import com.ningli.model.User;
import com.ningli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tomlee
 * @program: ningli
 * @Date: 2019/8/10 17:16
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper usermapper;

    @Override
    public List<User> getList() {
        return usermapper.getList();
    }
}
