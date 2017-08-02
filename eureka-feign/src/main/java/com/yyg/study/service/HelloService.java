package com.yyg.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gang on 2017/8/1.
 */

@FeignClient(value = "servicehi",fallback = HelloServbiceImpl.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);

}
