package com.bdqn.service;

import com.bdqn.dao.SaleNumMapper;
import com.bdqn.entity.SaleNum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/15.
 */
@Service
public class SaleNumServiceImpl implements SaleNumService {

    @Resource
    private SaleNumMapper saleNumMapper;

    @Override
    public int updateSaleNum(SaleNum saleNum) {
        return saleNumMapper.updateSaleNum(saleNum);
    }

    @Override
    public int querySaleNum() {
        return saleNumMapper.querySaleNum();
    }
}
