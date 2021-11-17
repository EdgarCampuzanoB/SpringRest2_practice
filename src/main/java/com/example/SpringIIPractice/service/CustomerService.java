package com.example.SpringIIPractice.service;

import com.example.SpringIIPractice.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {

    //Lista Clientes
    private List<Customer> customerList = new LinkedList<>();

    public CustomerService(){
    }

    public List<Customer> getCustomerList(){
        return customerList;
    }

    public Customer findCustomerByDni(String dni){
        for(Customer customer: customerList){
            if (customer.getDni().equalsIgnoreCase(dni)){
                return customer;
            }
        }
        return null;
    }

    //Create Customer
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    //UpdateCustomer
    public void updateCustomerByDni(String dni, Customer customer){
        if(deleteCustomerByDni(dni)){
            customerList.add(customer);
        }
    }

    //Delete
    public boolean deleteCustomerByDni(String dni){
        if(findCustomerByDni(dni) != null){
            customerList.remove(findCustomerByDni(dni));
            return true;
        }else{
            return false;
        }
    }
}
