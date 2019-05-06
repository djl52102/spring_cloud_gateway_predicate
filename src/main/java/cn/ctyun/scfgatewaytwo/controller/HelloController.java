package cn.ctyun.scfgatewaytwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/foo/bar")
    public void hello(){
        System.out.println("hello world");
    }
}
