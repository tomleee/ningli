package com.ningli.service;

import com.github.pagehelper.Page;
import com.ningli.model.User;

import java.util.List;

/**
 * @author tomlee
 * @program: ningli
 * @Date: 2019/8/10 17:16
 * @Description:
 */
public interface UserService {

    public List<User> getList();
}
