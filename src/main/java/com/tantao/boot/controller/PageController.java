package com.tantao.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {

    @GetMapping("/toPage")
    public String toPae(HttpServletRequest request){
        request.setAttribute("msg","请求成功");
        request.setAttribute("code",100);
        return "forward:/success";//转发到 /success请求
    }

    @GetMapping("/success")
    @ResponseBody
    public Map success(@RequestAttribute("msg") String msg,
                       HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        Object msg1 = request.getAttribute("msg");
        map.put("ann_msg",msg);
        map.put("ser_msg",msg1);
        return map;
    }


}
