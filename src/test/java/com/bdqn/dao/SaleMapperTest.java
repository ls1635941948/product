package com.bdqn.dao;

import com.bdqn.entity.Sale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SaleMapperTest {
    @Resource
    private SaleMapper saleMapper;


    @Test
    public void queryAllList() throws Exception {
        List<Sale> list=saleMapper.queryAllList();
        for (Sale sale : list) {
            System.out.println(sale);
        }
    }

    @Test
    public void addSale() throws Exception {
    }

    @Test
    public void querySale() throws Exception {
        List<Sale> list=saleMapper.querySale("加多宝");
        for (Sale sale : list) {
            System.out.println(sale);
        }


    }

}