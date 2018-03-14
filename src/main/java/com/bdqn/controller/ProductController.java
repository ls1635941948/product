package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Product;
import com.bdqn.service.ProductService;
import com.bdqn.util.Message;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 朱博文 on 2018/3/13.
 */
@org.springframework.stereotype.Controller
@RequestMapping("product")
public class ProductController {
    @Resource
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "updateproduct",method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    public String updateProduct(Product product){
        int n= productService.updateProduct(product);
        if(n>0){
            return JSON.toJSONString(Message.success());

        }
        return JSON.toJSONString(Message.error());

    }

    @RequestMapping(value = "toProduct")
    public String toProduct(Integer pageNum, Integer pageSiz, Model model){
        PageInfo<Product> pageInfo=productService.queryAll(pageSiz,pageNum);
        model.addAttribute("pageInfo",pageInfo);
        return "product";

    }
    @ResponseBody
    @RequestMapping(value = "queryProductById",method =RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    public String queryProductById(int id){
        Product product=productService.queryProductById(id);
        return JSON.toJSONString(product);

    }
    @ResponseBody
    @RequestMapping(value = "addProduct",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String addProduct(Product product){
        int n=productService.addProduct(product);
        if(n>0){
         return    JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
}
