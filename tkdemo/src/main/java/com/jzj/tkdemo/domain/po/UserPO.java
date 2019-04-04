package com.jzj.tkdemo.domain.po;

import javax.persistence.*;

@Table(name = "user")
public class UserPO {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * "用户姓名"
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 是否安全
     */
    private Boolean safe;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取"用户姓名"
     *
     * @return user_name - "用户姓名"
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置"用户姓名"
     *
     * @param userName "用户姓名"
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取是否安全
     *
     * @return safe - 是否安全
     */
    public Boolean getSafe() {
        return safe;
    }

    /**
     * 设置是否安全
     *
     * @param safe 是否安全
     */
    public void setSafe(Boolean safe) {
        this.safe = safe;
    }

    @Override
    public String toString() {
        return "UserPO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", safe=" + safe +
                '}';
    }
}