package com.example.springstart;

import jakarta.websocket.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.DigestUtils;


@SpringBootApplication
public class SpringStartApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringStartApplication.class, args);
        String a = "123456a";
        String a1 = DigestUtils.md5DigestAsHex(a.getBytes());
        String password = "123456a";
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(a1.equals(s));

    }

}
