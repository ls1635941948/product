package com.bdqn.entity;

/**
 * Created by Max on 3-13-2018-013.
 */

/**
 *id int(11) NOT NULL
 user_name varchar(10) NOT NULL
 password varchar(8) NOT NULL
 user_roles varchar(10) NOT NULL
 */


public class Users {
    private int id;
    private String userName,password,userroles;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userroles='" + userroles + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }
}
