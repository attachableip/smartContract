package com.webank.webase.controller;

import com.webank.webase.result.Result;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {

    @RequestMapping("/test")
    @ResponseBody
    String home(){
        return "<h1>This is aipc app welcome page! </h1>";
    }

    @RequestMapping("/ajax")
    @ResponseBody
    Result<String> ajax(){
        return Result.success("hello from ajax message");
    }



}
