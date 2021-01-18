package com.example.demo.model;

/**
 * 描述：用户表
 * @author 阿毅
 * @date 2021/1/17
 */
public class AyUser {
    //主键
    private String id;
    //用户名
    private String name;
    //密码
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
