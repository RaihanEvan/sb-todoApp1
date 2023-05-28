package com.raihan.myfirstwebapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("say-hello")
public class SayHelloController {
    public String sayHello(){
        return "Hello! this is a hello page.";
    }

}
