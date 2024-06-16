package com.example.controller;

import com.example.common.BizResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

/**
 * @author mirau on 2024/6/16.
 * @version 1.0
 */
@RestController
@RequestMapping("hello")
@Slf4j
public class HelloController {

    @GetMapping
    public BizResult<String> sayHello(String name) {
        log.debug("say hello to {}", name);
        return BizResult.success(MessageFormat.format("hello {0}", name));
    }
}
