package com.javasm.config;

import com.javasm.pojo.Person;
import com.javasm.pojo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2022/10/25-16:45
 * @Since：jdk1.8
 * @Description：
 */
@Configuration
@EnableConfigurationProperties({User.class,Person.class})//1.开启User属性自动配置功能,2.把组件导入到容器中

public class MyConfig {

}
