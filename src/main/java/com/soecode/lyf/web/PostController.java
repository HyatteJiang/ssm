package com.soecode.lyf.web;


import com.soecode.lyf.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/post")
public class PostController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/test",  method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    private Result testRes(){
        Result result =new Result(false,"asdsad");
        return result;
    }
}
