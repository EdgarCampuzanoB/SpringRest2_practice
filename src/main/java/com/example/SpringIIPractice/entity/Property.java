package com.example.SpringIIPractice.entity;

public class Property {
    private Integer code;
    private String address;
    private Float amount;

    public Property() {
    }

    public Property(Integer code, String address, Float amount) {
        this.code = code;
        this.address = address;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Property{" +
                "code=" + code +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
