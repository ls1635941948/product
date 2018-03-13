package com.bdqn.dao;

import com.bdqn.entity.Users;

import java.util.List;

/**
 * Created by Max on 3-13-2018-013.
 */
public interface UsersMapper {

    public Users UsersLogin(Users users);

    public int addUser(Users users);

    public List<Users> queryAll();

    public int updateUser(Users users);

    public Users queryUserById(int id);
}
