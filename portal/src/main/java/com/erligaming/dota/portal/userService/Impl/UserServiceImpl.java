package com.erligaming.dota.portal.userService.Impl;


import com.erligaming.dota.dao.UserDaoMapper;
import com.erligaming.dota.model.vo.ResponseVO;
import com.erligaming.dota.model.vo.UserRegisterVO;
import com.erligaming.dota.portal.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDaoMapper userDao;


    @Override
    public ResponseVO registerUser(UserRegisterVO vo) {




        return null;
    }



}
