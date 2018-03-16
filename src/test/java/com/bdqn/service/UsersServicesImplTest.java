package com.bdqn.service;

import com.bdqn.entity.Users;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

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

    @Test
    public void addUser() throws Exception {
        Users users = new Users();
        users.setUserName("user7");
        users.setPassword("1234");
        users.setUserName("客户");
        int n=usersService.addUser(users);
        if (n>0) {
            System.out.println("success");
        }else{
            System.out.println("failed");
        }
    }

    @Test
    public void updateUser() throws Exception {
        Users users = new Users();
        users.setId(5);
        users.setStatus(0);
        int n=usersService.updateUser(users);
        if (n>0) {
            System.out.println("success");
        }else{
            System.out.println("failed");
        }
    }

    @Test
    public void queryAll() throws Exception {
        PageInfo<Users> pageInfo = usersService.queryAll(2, 2);
        if (null != pageInfo) {
            System.out.println(pageInfo);
            List<Users> list=pageInfo.getList();
            if (null != list) {
                for (Users users : list) {
                    System.out.println(users);
                }
            }
        }
    }

}