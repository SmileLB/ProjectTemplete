package com.example.administrator.superdemo.bean;

/**
 * Created by LiBing
 * on 2017/7/14 0014
 * describe:
 */

public class LoginBean extends BaseEntity{
    private String token;

    private  User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
