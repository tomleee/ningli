package com.ningli.mapper;

import com.github.pagehelper.Page;
import com.ningli.model.User;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author tomlee
 * @program: ningli
 * @Date: 2019/8/10 17:18
 * @Description:
 */
@Mapper
public interface UserMapper {

    public List<User> getList();
}
