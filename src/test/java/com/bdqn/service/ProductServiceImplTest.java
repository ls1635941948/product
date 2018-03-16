package com.bdqn.service;

import com.bdqn.entity.Product;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 朱博文 on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ProductServiceImplTest {
    @Test
    public void queryProductById() throws Exception {
        System.out.println(productService.queryProductById(1));
    }

    @Resource
    private ProductService productService;
    @Test
    public void queryAll() throws Exception {
        PageInfo<Product> pageInfo=productService.queryAll(1,3);
        if(pageInfo!=null){
            List<Product> list=pageInfo.getList();
            for (Product product:list){
                System.out.println(product);
            }

        }
    }

    @Test
    public void updateProduct() throws Exception {
        Product product=new Product();
        product.setId(7);
        product.setQuantity(100);
        System.out.println(productService.updateProduct(product));
    }


    @Test
    public void addProduct() throws Exception {
        Product product=new Product();
        product.setProductName("辣条");
        product.setPrice(0.5);
        product.setQuantity(400);
        System.out.println(productService.addProduct(product));
    }




}
