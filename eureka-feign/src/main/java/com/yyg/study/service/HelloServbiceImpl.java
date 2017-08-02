package com.yyg.study.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gang on 2017/8/1.
 */
@Component
public class HelloServbiceImpl implements HelloService{
    @Override
    public String hello(@RequestParam("name") String name) {
        return "Sorry "+name+" ,please call the manager";
    }
}
