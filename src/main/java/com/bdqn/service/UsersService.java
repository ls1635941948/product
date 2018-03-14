package com.bdqn.service;

import com.bdqn.entity.Users;
import com.github.pagehelper.PageInfo;

/**
 * Created by Max on 3-13-2018-013.
 */
public interface UsersService {

    public Users UsersLogin(Users users);

    public int addUser(Users users);

    public PageInfo<Users> queryAll(Integer pageNum, Integer pageSize);

    public int updateUser(Users users);

    public Users queryUserById(int id);
}
