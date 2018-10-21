package com.erligaming.dota.Util;

import com.erligaming.dota.Base.BaseModel;
import com.erligaming.dota.Commons.Constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class CommonUtil {
    private static final Logger log = LoggerFactory.getLogger(CommonUtil.class);

    public static<T extends BaseModel> T addOperator(T entity, boolean isCreate, String operator){
        if (isCreate){
            entity.setCreateTime(new Date());
            entity.setCreator(operator);
            entity.setVersion(0);
            entity.setSysState(Constants.STATUS_NORMAL);
        }
        entity.setModifyTime(new Date());
        entity.setOperator(operator);

        return entity;
    }

}
