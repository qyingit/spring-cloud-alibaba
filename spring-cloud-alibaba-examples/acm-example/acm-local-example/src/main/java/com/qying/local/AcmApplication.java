package com.qying.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类描述：
 *
 * @author qying
 * @date 2019/10/25 10:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AcmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcmApplication.class);
    }
}
