package com.bdqn.service;

import com.bdqn.dao.UsersMapper;
import com.bdqn.entity.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public int addUser(Users users) {
        return usersMapper.addUser(users);
    }

    @Override
    public PageInfo<Users> queryAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Users> list=usersMapper.queryAll();
        PageInfo<Users> pageInfo = new PageInfo<Users>(list);
        return pageInfo;
    }

    @Override
    public int updateUser(Users users) {
        return usersMapper.updateUser(users);
    }

    @Override
    public Users queryUserById(int id) {
        return usersMapper.queryUserById(id);
    }

}
