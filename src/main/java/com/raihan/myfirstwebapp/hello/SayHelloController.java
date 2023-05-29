package com.raihan.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller //is a controller/web api class
public class SayHelloController {
    @RequestMapping("say-hello")    //url mapping to the link
    @ResponseBody       //string repesent
    public String sayHello(){
        return "Hello! this is a hello page.:v";
    }
    @RequestMapping("say-hello-html1")    //url mapping to the link
    @ResponseBody       //string repesent
    public String sayHelloHTML1(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>My First HTML Page</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    Looking for Something???\n" +
                "</body>\n" +
                "</html>");
        return stringBuffer.toString();
    }
    @RequestMapping(path="/say-hello-jsp")    //url mapping to the link
    //@ResponseBody
    public String sayHelloJsp(){
        return "sayHello";
    }

}
