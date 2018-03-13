package com.bdqn.service;

import com.bdqn.dao.UsersMapper;
import com.bdqn.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Max on 3-13-2018-013.
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService{
    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users UsersLogin(Users users) {
        return usersMapper.UsersLogin(users);
    }
}
