package com.yyg.study.conteoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gang on 2017/8/1.
 */
@RestController
@SpringBootApplication
public class HelloController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+",i am from port:" +port;
    }

}
