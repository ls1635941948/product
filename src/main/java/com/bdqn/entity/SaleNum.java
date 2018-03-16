package com.bdqn.entity;

/**
 * Created by Administrator on 2018/3/15.
 */
public class SaleNum {
    private int id,saleSize;

    @Override
    public String toString() {
        return "SaleNum{" +
                "id=" + id +
                ", saleSize=" + saleSize +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaleSize() {
        return saleSize;
    }

    public void setSaleSize(int saleSize) {
        this.saleSize = saleSize;
    }

    public SaleNum(int id, int saleSize) {
        this.id = id;
        this.saleSize = saleSize;
    }

    public SaleNum() {
    }
}
