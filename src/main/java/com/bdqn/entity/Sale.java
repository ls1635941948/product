package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/13.
 */
public class Sale {
    private int id,quantity;
    private double totalPrice;
    private Date saleDate;
    private Users users;
    private Product product;
    private String saleCode;


    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", saleDate=" + saleDate +
                ", users=" + users +
                ", product=" + product +
                ", saleCode='" + saleCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public Sale(int id, int quantity, double totalPrice, Date saleDate, Users users, Product product, String saleCode) {
        this.id = id;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
        this.users = users;
        this.product = product;
        this.saleCode = saleCode;
    }

    public Sale() {
    }
}
