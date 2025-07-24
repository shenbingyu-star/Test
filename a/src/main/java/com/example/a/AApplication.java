package com.example.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.Arrays;

@SpringBootApplication
public class AApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(AApplication.class, args);
        Jedis jedis = context.getBean("jedis",Jedis.class);
        System.out.println(jedis);


//        jedis.set("name","helloWorld");
//        String str = jedis.get("name");
//        System.out.println("今天="+str);


//        String[] beanNames = context.getBeanNamesForType(Jedis.class);
//        System.out.println("Jedis Bean Names: " + Arrays.toString(beanNames));
//
//


    }

}
