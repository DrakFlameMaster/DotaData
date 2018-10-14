package com.erligaming.dota.dao;

import com.erligaming.dota.model.entity.UserEntity;

public interface UserDaoMapper {

    UserEntity selectByPrimaryKey(Long pkid);

}
