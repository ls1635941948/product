package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Product;
import com.bdqn.entity.Sale;
import com.bdqn.entity.SaleNum;
import com.bdqn.entity.Users;
import com.bdqn.service.ProductService;
import com.bdqn.service.SaleNumService;
import com.bdqn.service.SaleService;
import com.bdqn.util.Message;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by 朱博文 on 2018/3/13.
 */
@org.springframework.stereotype.Controller
@RequestMapping("product")
public class ProductController {
    @Resource
    private ProductService productService;
    @Resource
    private SaleService saleService;
    @Resource
    private SaleNumService saleNumService;


    @ResponseBody
    @RequestMapping(value = "updateProduct",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String updateProduct(Product product, HttpSession httpSession){
        int goumai=product.getQuantity();
        Product queryProduct=productService.queryProductById(product.getId());
        int quantity=queryProduct.getQuantity()-product.getQuantity();
        if(quantity<0){
            return JSON.toJSONString(Message.error());
        }
        Product updateProduct=new Product();
        updateProduct=product;
        updateProduct.setQuantity(quantity);
        int a=productService.updateProduct(updateProduct);
        if (a > 0) {
            Users users= (Users) httpSession.getAttribute("loginUser");
            String userId= String.valueOf(users.getId());
            String saleNum= String.valueOf(saleNumService.querySaleNum());
            double totalPrice=goumai*product.getPrice();
            String saleCode=userId+String.valueOf(product.getId());
            int length=10-saleCode.length();
            for(int i=0;i<length;i++){
                saleCode=saleCode+0;
            }
            saleCode=saleCode+saleNum;
            Sale sale=new Sale(0,goumai,totalPrice,null,users,updateProduct,saleCode);
            saleService.addSale(sale);
            saleNumService.updateSaleNum(new SaleNum(1,0));
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }

    @RequestMapping(value = "toProduct")
    public String toProduct(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Product> pageInfo=productService.queryAll(pageNum,pageSize);
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
         return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
}
