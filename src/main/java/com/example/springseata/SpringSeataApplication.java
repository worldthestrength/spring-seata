package com.example.springseata;

import com.example.springseata.feign.BaiDuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(value = {"com.example.springseata.feign"})
public class SpringSeataApplication  implements CommandLineRunner {


    @Autowired
    private BaiDuFeign baiDuFeign;

    public static void main(String[] args) {

        SpringApplication.run(SpringSeataApplication.class, args);



    }

    @Override
    public void run(String... args) throws Exception {
        baiDuFeign.search("hello");
    }
}
