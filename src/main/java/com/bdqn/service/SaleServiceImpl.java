package com.bdqn.service;

import com.bdqn.dao.SaleMapper;
import com.bdqn.entity.Sale;
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
    public List<Sale> queryAllList() {
        return saleMapper.queryAllList();
    }

    @Override
    public int addSale(Sale sale) {
        return saleMapper.addSale(sale);
    }

    @Override
    public List<Sale> querySale(String title) {
        return saleMapper.querySale(title);
    }
}
