package com.bdqn.controller;

import com.bdqn.entity.Users;
import com.bdqn.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Max on 3-13-2018-013.
 */

@Controller
@RequestMapping("user")
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping(value = "toUser", method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public String login(Users users, HttpSession httpSession, Model model) {
        Users loginUser = usersService.UsersLogin(users);
        if (null != loginUser) {
            httpSession.setAttribute("loginUser", loginUser);
            return "main";
        }
        model.addAttribute("message", "用户名密码错误");
        return "index";
    }
}