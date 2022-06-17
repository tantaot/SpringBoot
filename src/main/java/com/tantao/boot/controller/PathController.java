package com.tantao.boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PathController {

    @GetMapping("/path/{id}/{name}")
    public Map testPath(@PathVariable("id")Integer id, @PathVariable("name")String name,
                        @PathVariable Map pathVariable,
                        @RequestParam("interests")String[] interests, @RequestParam("gender")String gender,
                        @RequestParam Map requestParam,
                        @RequestHeader("User-Agent")String userAgent, @RequestHeader Map<String,String> headr,
                        @CookieValue("Idea-f002a16a")String value,
                        @CookieValue("Idea-f002a16a")Cookie cookie){
        Map<String,Object> map = new HashMap<>();
       /*
        map.put("id",id);
        map.put("name",name);
        map.put("pathVariable",pathVariable);
        map.put("interests",interests);
        map.put("gender",gender);
        map.put("requestParam",requestParam);*/
//        map.put("userAgent",userAgent);
//        map.put("headr",headr);
        map.put("value",value);
        System.out.println(cookie.getName() +"==="+ cookie.getValue());
        return map;
    }


    @PostMapping("/save")
    public Map saveInfo(@RequestBody String body){
        Map<String,Object> map = new HashMap<>();
        map.put("body",body);
        return map;
    }

//    /cars/sell;low=34;brand=byd,audi,yd
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low")Integer low,@MatrixVariable("brand")String[] brand,
                        @PathVariable("path")String path){
        Map<String,Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }

    //  /boss/1;age=20/2;age=10
    @GetMapping("/boss/{bossId}/{empId}")
    public Map bossAge(@MatrixVariable(value="age",pathVar = "bossId")Integer bossAge,
                       @MatrixVariable(value="age",pathVar = "empId")Integer empAge){
        Map<String,Object> map = new HashMap<>();
        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;
    }

}
