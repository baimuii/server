package com.example.server.controller;

import com.example.server.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录Controller
 *
 * @author baimuii
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private User user;

    @ApiOperation("跳转登录页面")
    @GetMapping(value = "")
    public String login(){
        return "login";
    }

    @ApiOperation("登录")
    @PostMapping(value = "/login")
    @ResponseBody
    public String tologin(){


        return "首页";
    }

    @ApiOperation("注册")
    /**
     * 这里不确定咋写
     * @PostMapping(value = "/login")
     */
    public String enroll(){


        return "注册！";
    }


}
