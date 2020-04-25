package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {

    @RequestMapping("/index")
    public String index1(ModelMap map){
        //加入一个属性，用来在模板中读取
        map.addAttribute("host","http://47.93.36.145:8080/travel");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
