package com.bdqn.service;

import com.bdqn.entity.Sale;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/3/14.
 */
public interface SaleService {
    public PageInfo<Sale> queryAllList(Integer pageNum,Integer pageSize);
    public int addSale(Sale sale);
    public PageInfo<Sale> querySale(@Param("title")String title,Integer pageNum,Integer pageSize);

}
