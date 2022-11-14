package com.javasm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2022/11/14-11:52
 * @Since：jdk1.8
 * @Description：
 */
@RestController
@Slf4j
public class LoginController {

    @GetMapping("login")
    public void login(){
      log.info("登录功能的实现");
    }
}
