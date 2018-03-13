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
    @Resource
    private ProductService productService;
    @Test
    public void queryAll() throws Exception {
        PageInfo<Product> pageInfo=productService.queryAll(2,3);
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
        product.setProductName("太阳");
        product.setQuantity(800);
    }

    @Test
    public void queryProductById() throws Exception {
    }

    @Test
    public void addProduct() throws Exception {
        Product product=new Product();
        product.setProductName("测试名字");
        product.setQuantity(10);

    }




}
