package com.javasm.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author：xiaoYuncong
 * @Version：1.0
 * @Date：2022/10/25-16:09
 * @Since：jdk1.8
 * @Description：
 */

@ConfigurationProperties(prefix = "usr")
@PropertySource("classpath:config/user.properties")
@Data
@Component
public class User {
   private String name;
   private Integer age;

}
