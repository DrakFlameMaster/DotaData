package com.erligaming.dota.model.entity;

import com.erligaming.dota.Base.BaseModel;

public class UserEntity extends BaseModel {

    private String name;

    private String sex;

    private String phone;

    private String nickName;

    private String emailAddress;

    private String state;

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", nickName='" + nickName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
