package com.orderService.Order.entities;

public class Order {

    private Integer code;
    private double basic;
    private double discount;


    public void setCode(Integer code) {
        this.code = code;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public double getBasic() {
        return basic;
    }

    public Order(Integer code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

}
