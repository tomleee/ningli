package com.ningli.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ningli.model.User;
import com.ningli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author tomlee
 * @program: ningli
 * @Date: 2019/8/10 17:11
 * @Description:
 */

@Controller
@RequestMapping("/ningli")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    public Page<User> getList(@RequestParam(name = "index1",required = true) Integer pageNum,

                                  @RequestParam(name = "index2",required = true) Integer pageSize){

        PageHelper.startPage(pageNum, pageSize);

        List<User> list1 = userService.getList();
        Page<User> list =(Page)list1;
        System.out.println(pageSize + pageNum);
        System.out.println("===============================");
        return list;
    }
}
