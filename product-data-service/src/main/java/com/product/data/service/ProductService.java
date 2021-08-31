package com.product.data.service;

import com.product.data.domian.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 18:41:49
 * @Description
 */
@Service
public class ProductService {
    @Value("${server.port}")
    private String port;

    public List<Product> productList(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"product a from port: " + port,100));
        products.add(new Product(2,"product b from port: " + port,100));
        products.add(new Product(3,"product c from port: " + port,100));
        products.add(new Product(4,"product c from port: " + port,100));
        products.add(new Product(5,"product c from port: " + port,100));
        products.add(new Product(6,"product c from port: " + port,100));
        products.add(new Product(7,"product c from port: " + port,100));
        products.add(new Product(8,"product c from port: " + port,100));
        products.add(new Product(9,"product c from port: " + port,100));
        products.add(new Product(10,"product c from port: " + port,100));
        products.add(new Product(11,"product c from port: " + port,100));
        products.add(new Product(12,"product c from port: " + port,100));
        products.add(new Product(13,"product c from port: " + port,100));
        products.add(new Product(14,"product c from port: " + port,100));
        products.add(new Product(15,"product c from port: " + port,100));
        return products;
    }
}
