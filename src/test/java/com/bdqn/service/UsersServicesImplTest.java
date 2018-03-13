package com.bdqn.service;

import com.bdqn.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Max on 3-13-2018-013.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UsersServicesImplTest {

    @Resource
    private UsersService usersService;

    @Test
    public void usersLogin() throws Exception {
        Users users = new Users();
        users.setUserName("admin");
        users.setPassword("1234");
        Users loginUser=usersService.UsersLogin(users);
        if (loginUser!=null) {
            System.out.println("success");
        }else{
            System.out.println("failed");
        }
    }

}