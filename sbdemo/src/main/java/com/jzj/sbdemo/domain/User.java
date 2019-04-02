package com.jzj.sbdemo.domain;

/**
 * 描述：
 *
 * @author jiazijie
 * @since 2019-04-02 上午8:01
 */
public class User {

    private Integer id;
    private String userName;
    private String password;
    private boolean safe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", safe=" + safe +
                '}';
    }
}
