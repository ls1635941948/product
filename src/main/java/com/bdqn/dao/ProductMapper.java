package com.bdqn.dao;

import com.bdqn.entity.Product;

import java.util.List;

/**
 * Created by 朱博文 on 2018/3/13.
 */
public interface ProductMapper {
    public List<Product> queryAll();
    public Integer updateProduct(Product product);
    public Product queryProductById(int id);
    public Integer addProduct(Product product);

}
