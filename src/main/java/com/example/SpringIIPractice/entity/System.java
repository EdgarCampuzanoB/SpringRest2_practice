package com.example.SpringIIPractice.entity;

import com.example.SpringIIPractice.entity.Customer;
import com.example.SpringIIPractice.entity.Property;
import com.example.SpringIIPractice.repository.Charge;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class System {
    private List<Customer> customers = new LinkedList<>();
    private List<Charge> charges = new ArrayList<>();
    private List<Property> properties = new LinkedList<>();

    public void createCustomer(String dni, String name){
    }

    public void createProperty(Integer code, String address, Float amount){

    }

    public void generateCharge(Customer customer, Property property){

    }
}
