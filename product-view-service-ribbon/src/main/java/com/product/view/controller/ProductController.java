package com.product.view.controller;

import com.product.view.domian.Product;
import com.product.view.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 22:02:52
 * @Description
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping
    public String product(Model model){
        List<Product> products = productService.listProductRibbon();
        model.addAttribute("products",products);
        return "/product/product";
    }

    @RequestMapping("listRibbon")
    @ResponseBody
    public List<Product> productRibbon(){
        List<Product> products = productService.listProductRibbon();
        return products;
    }

    @RequestMapping("listFeign")
    @ResponseBody
    public List<Product> productFeign(){
        List<Product> products = productService.listProductFeign();
        return products;
    }
}
