package com.bdqn.service;

import com.bdqn.entity.Product;
import com.github.pagehelper.PageInfo;

/**
 * Created by 朱博文 on 2018/3/13.
 */

public interface ProductService {
    public PageInfo<Product> queryAll(Integer pageNum,Integer pageSize);
    public Integer updateProduct(Product product);
    public Product queryProductById(int id);
    public Integer addProduct(Product product);

}
