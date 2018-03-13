package com.bdqn.service;

import com.bdqn.dao.ProductMapper;
import com.bdqn.entity.Product;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 朱博文 on 2018/3/13.
 */@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    public PageInfo<Product> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> list=productMapper.queryAll();
        PageInfo<Product> pageInfo=new PageInfo<Product>(list);
        return pageInfo;


    }

    public Integer updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    public Product queryProductById(int id) {
        return productMapper.queryProductById(id);
    }
}
