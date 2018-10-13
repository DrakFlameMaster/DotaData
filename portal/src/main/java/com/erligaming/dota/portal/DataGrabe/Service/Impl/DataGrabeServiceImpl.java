package com.erligaming.dota.portal.DataGrabe.Service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.erligaming.dota.Commons.Constants.Constants;
import com.erligaming.dota.Commons.Enum.DotaUrlEnum;
import com.erligaming.dota.model.vo.ResponseVO;
import com.erligaming.dota.portal.DataGrabe.Service.DataGrabeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DataGrabeServiceImpl implements DataGrabeService {

    private static Logger logger = LoggerFactory.getLogger(DataGrabeService.class);


    @Autowired
    private RestTemplate restTemplate;

    @Value("${DOTA_API_KEY}")
    private String dotaApiKey;

    @Override
    public ResponseVO gameRecordGrabe(String userId) {
        return null;
    }

    @Override
    public ResponseVO getMatchHistory(String matchId) {
        String url = buildUrl(DotaUrlEnum.MatchHistory.getUrl(),dotaApiKey)+"&match_id="+matchId;
        JSONObject body = null;
        try {
            ResponseEntity<JSONObject> response = restTemplate.getForEntity(url, JSONObject.class);
            body=response.getBody();
        } catch (Exception e) {
            logger.error("调用服务[]异常！ url = {}",url);
            throw e;
        }
        return new ResponseVO(true, Constants.SUCCESS_CODE,"查询成功", body);
    }





    private String buildUrl(String url,String apiKey){
        return DotaUrlEnum.BaseUrl.getUrl()+url+"?key="+apiKey;
    }


}
