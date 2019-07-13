package com.baoguoding.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {

        // 输出字符串
        logger.debug("this is a debug msg");
        // 占位符
        logger.debug("hi, welcome {}, today is {}","admin","Sunday");

        return "Greetings from Spring Boot!";
    }

}