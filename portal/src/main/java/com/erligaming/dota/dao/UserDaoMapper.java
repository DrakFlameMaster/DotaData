package com.erligaming.dota.dao;

import com.erligaming.dota.Base.BaseMapper;
import com.erligaming.dota.model.entity.UserEntity;

public interface UserDaoMapper  {

    /**
     * 根据主键获取一条数据库记录
     *
     * @param pkid
     */
    UserEntity selectByPrimaryKey(Long pkid);


}
