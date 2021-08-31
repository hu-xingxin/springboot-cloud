package com.product.data.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huxingxin
 * @createTime 2021年08月29日 18:40:10
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
}
