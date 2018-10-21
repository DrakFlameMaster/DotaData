package com.erligaming.dota.model.vo;

import java.io.Serializable;

public class UserRegisterVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nickName;

    private String email;

    private String passWord;


    @Override
    public String toString() {
        return "UserRegisterVO{" +
                "nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
