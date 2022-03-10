package com.easemob.agora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * ClassName: SpringBootApplication
 * description:
 * author: lijian
 * date: 2021-01-19 09:15
 **/
@EnableJpaRepositories
@EntityScan("com.easemob.agora.model")
@SpringBootApplication(scanBasePackages = "com.easemob")
public class AgoraServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgoraServerApplication.class, args);
    }
}
