package com.bdqn.service;

import com.bdqn.dao.SaleMapper;
import com.bdqn.entity.Sale;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
@Service
public class SaleServiceImpl implements SaleService {

    @Resource
    private SaleMapper saleMapper;


    @Override
    public PageInfo<Sale> queryAllList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Sale> list=saleMapper.queryAllList();
        return new PageInfo<>(list);
    }

    @Override
    public int addSale(Sale sale) {
        return saleMapper.addSale(sale);
    }

    @Override
    public PageInfo<Sale> querySale(String title, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Sale> list=saleMapper.querySale(title);
        return new PageInfo<>(list);
    }


}
