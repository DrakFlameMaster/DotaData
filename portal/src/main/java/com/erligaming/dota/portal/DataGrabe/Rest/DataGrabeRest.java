package com.erligaming.dota.portal.DataGrabe.Rest;

import com.erligaming.dota.Commons.Constants.Constants;
import com.erligaming.dota.model.vo.ResponseVO;
import com.erligaming.dota.portal.DataGrabe.Service.DataGrabeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataGrabeRest {

    private static Logger logger = LoggerFactory.getLogger(DataGrabeRest.class);

    @Value("${DOTA_API_KEY}")
    private String dotaApiKey;


    @Autowired
    DataGrabeService dataGrabeService;


    @RequestMapping("/getMatchHistory/{steamGameId}")
    @ResponseBody
    public ResponseVO dataInfoGrabe(@PathVariable("steamGameId") Long userId) {
        logger.info("[查询比赛记录]开始");
        ResponseVO response;
        try{
            response = dataGrabeService.getMatchHistory(userId);

        }catch (Exception e){
            logger.error(e.getMessage());
            return new ResponseVO(false, Constants.FAILURE_CODE,Constants.MESSAGE_ID_EXCEPTION,null);
        }finally{
            logger.info("[查询比赛记录]结束");
        }
        return response;
    }



}
