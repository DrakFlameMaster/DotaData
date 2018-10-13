package com.erligaming.dota.portal.DataGrabe.Service;

import com.erligaming.dota.model.vo.ResponseVO;
import org.springframework.stereotype.Service;

public interface DataGrabeService {
    /**
     *  获取比赛记录数据服务
     *
     */
    public ResponseVO gameRecordGrabe(String userId);



    public ResponseVO getMatchHistory(String userId);

}
