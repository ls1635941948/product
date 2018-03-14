package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/13.
 */
public class Sale {
    private int id,quantity,saleCode;
    private double price,totalPrice;
    private Date saleDate;
    private Users users;
    private Product product;

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", saleCode=" + saleCode +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", saleDate=" + saleDate +
                ", users=" + users +
                ", product=" + product +
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

    public int getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(int saleCode) {
        this.saleCode = saleCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Sale(int id, int quantity, int saleCode, double price, double totalPrice, Date saleDate, Users users, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.saleCode = saleCode;
        this.price = price;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
        this.users = users;
        this.product = product;
    }

    public Sale() {
    }
}
