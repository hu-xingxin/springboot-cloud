package com;

import brave.sampler.Sampler;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 18:50:28
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductDataServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProductDataServiceApplication.class).run(args);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
