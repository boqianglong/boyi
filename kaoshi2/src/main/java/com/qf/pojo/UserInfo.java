package com.qf.pojo;

import java.util.Date;

public class UserInfo {

    int id ;
    String goodsTitle;
    String goodsName;
    int basePrice;//市场价
    int price;//销售价格
    int costPrice;//成本价
    int stockNum;
    String goodsDesc;//商品描述
    String status;//状态 TOP 上架  DOWN 下架 DBL 删除
    int goodsHot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGoodsHot() {
        return goodsHot;
    }

    public void setGoodsHot(int goodsHot) {
        this.goodsHot = goodsHot;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", basePrice=" + basePrice +
                ", price=" + price +
                ", costPrice=" + costPrice +
                ", stockNum=" + stockNum +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", status='" + status + '\'' +
                ", goodsHot=" + goodsHot +
                '}';
    }
}
