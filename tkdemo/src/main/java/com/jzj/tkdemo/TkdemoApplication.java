package com.jzj.tkdemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.jzj.tkdemo.dao")
public class TkdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkdemoApplication.class, args);
    }

}
