package com.erligaming.dota.Base;

public interface BaseMapper<T extends BaseModel> {

    public T selectByPrimaryKey(Long pkid);


}
