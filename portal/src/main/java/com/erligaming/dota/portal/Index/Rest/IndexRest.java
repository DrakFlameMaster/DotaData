package com.erligaming.dota.portal.Index.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexRest {

    @RequestMapping(path={"/"},method = {RequestMethod.GET})
    @ResponseBody
    public String helloWorld(){
        return "Hello world";
    }



    @RequestMapping(path={"/index"})
    public String index(){
        return "/index";
    }
}
