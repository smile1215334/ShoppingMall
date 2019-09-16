package com.shop.user.controller;


import com.shop.user.bean.UserInfo;
import com.shop.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author smile
 * @since 2019-09-16
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/epm")
    public List<UserInfo> getUserListAll(){
        List<UserInfo> userList = userInfoService.list();
        System.out.print("userList==================="+userList);
        return userList;
    }

}

