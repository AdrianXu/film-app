package com.beihang.web.controller;  
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beihang.dubbo.service.FilmServer;
  
@Controller  
@RequestMapping(value="/")  
public class DubboWebController {  
  
    @Autowired  
    public FilmServer filmService;  
      
    @RequestMapping(value="sayHello")  
    public @ResponseBody String duboo1(){  
        System.out.println("come into WebController ......");  
        String zoosharestr = filmService.sayHello("World");
        System.out.println(zoosharestr);  
        return zoosharestr;  
    }  
      
    /* 
    @RequestMapping(value="duboo1") 
    public String duboo1(){ 
        System.out.println("jinru......"); 
        return "index"; 
    } 
    */  
      
}  