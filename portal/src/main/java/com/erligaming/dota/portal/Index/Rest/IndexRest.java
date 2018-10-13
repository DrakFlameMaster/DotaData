package com.erligaming.dota.portal.Index.Rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRest {

    @RequestMapping(path={"/index","/"},method = {RequestMethod.GET})
    @ResponseBody
    public String index(){
        return "Hello world";
    }
}
