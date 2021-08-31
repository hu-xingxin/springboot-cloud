package com.product.view.config;

import com.product.view.domian.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author huxingxin
 * @createTime 2021年08月30日 09:24:00
 * @Description
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @RequestMapping("products")
    public List<Product> products();
}
