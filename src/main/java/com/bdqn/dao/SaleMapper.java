package com.bdqn.dao;

import com.bdqn.entity.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13.
 */
public interface SaleMapper {
    public List<Sale> queryAllList();
    public int addSale(Sale sale);
    public List<Sale> querySale(@Param("title")String title);


}
