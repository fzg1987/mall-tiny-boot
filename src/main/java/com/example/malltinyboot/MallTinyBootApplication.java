package com.example.malltinyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 开启组件扫描和应用装配

/**
 * @author fzg1987
 */
@SpringBootApplication
public class MallTinyBootApplication {

    public static void main(String[] args) {
        // 负责引导应用程序启动
        SpringApplication.run(MallTinyBootApplication.class, args);
    }

}
