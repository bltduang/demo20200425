package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController：Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
 * 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
 */
@RestController
public class HelloController {

    /**
     * @RequestMapping：配置url映射
     */
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
