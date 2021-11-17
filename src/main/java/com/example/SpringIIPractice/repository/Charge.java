package com.example.SpringIIPractice.repository;

import com.example.SpringIIPractice.entity.Customer;
import com.example.SpringIIPractice.entity.Property;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Charge {
    private Integer number;
    private Date date;
    private Customer customer;
    private Property property;

    public Charge() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "number=" + number +
                ", date=" + date +
                ", customer=" + customer +
                ", property=" + property +
                '}';
    }
}
