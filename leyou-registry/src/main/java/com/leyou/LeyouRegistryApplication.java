/**
 * Copyright (C), 2018-2019, 重庆智汇航安智能科技研究院有限公司
 * FileName: LeyouRegistryApplication
 * Author:   Original Dream
 * Date:     2019/10/25 9:20
 * Description:
 */
package com.leyou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LeyouRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouRegistryApplication.class, args);
    }
}
