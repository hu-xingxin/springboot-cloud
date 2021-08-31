package com.product.data.controller;

import com.product.data.domian.Product;
import com.product.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 18:47:18
 * @Description
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("products")
    @ResponseBody
    public List<Product> products(){
        return productService.productList();
    }
}
