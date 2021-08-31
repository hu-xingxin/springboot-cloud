package com.product.view.service;

import com.product.view.config.ProductClientFeign;
import com.product.view.config.ProductClientRibbon;
import com.product.view.domian.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 23:28:43
 * @Description 服务类，数据从 ProductClientRibbon 中获取
 */
@Service
public class ProductService {
    @Autowired
    private ProductClientRibbon productClientRibbon;

    @Autowired
    private ProductClientFeign productClientFeign;

    public List<Product> listProductRibbon(){
        return productClientRibbon.products();
    }

    public List<Product> listProductFeign(){
        return productClientFeign.products();
    }
}
