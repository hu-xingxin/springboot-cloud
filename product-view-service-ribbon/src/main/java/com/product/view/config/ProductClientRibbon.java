package com.product.view.config;

import com.product.view.domian.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 23:27:45
 * @DescriptionRibbon 客户端， 通过 restTemplate 访问 http://PRODUCT-DATA-SERVICE/products ，
 * 而 product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称。
 */
@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public List<Product> products() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
