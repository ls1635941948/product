package com.bdqn.service;

import com.bdqn.entity.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
public interface SaleService {
    public List<Sale> queryAllList();
    public int addSale(Sale sale);
    public List<Sale> querySale(@Param("title")String title);

}
