package com.erligaming.dota.model.entity;

import com.erligaming.dota.Base.BaseModel;

public class LoginEntity extends BaseModel {

    private String loginName;

    private String password;

    private Long userId;

    private String type;

    private String salt;

    @Override
    public String toString() {
        return "LoginEntity{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", type='" + type + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
