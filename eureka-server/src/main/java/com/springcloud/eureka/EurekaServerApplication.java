package com.springcloud.eureka;

import cn.hutool.core.util.NetUtil;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 18:11:30
 * @Description 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication{
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).run(args);
    }
}
