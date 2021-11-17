package com.example.SpringIIPractice.controller;


import com.example.SpringIIPractice.configuration.SCExceptionNotFound;
import com.example.SpringIIPractice.entity.Customer;
import com.example.SpringIIPractice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Iterable<Customer> customers(){
        return customerService.getCustomerList();
    }

    //Find Customer by dni
    @GetMapping("/{dni}")
    public @ResponseBody ResponseEntity<Customer> find(@PathVariable ("dni") String dni) throws SCExceptionNotFound {
         if(customerService.findCustomerByDni(dni) == null){
             throw new SCExceptionNotFound();

         }
         return ResponseEntity.ok(customerService.findCustomerByDni(dni));
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer){
         customerService.addCustomer(customer);
    }

    @PutMapping("/{dni}")
    public void modifyCustomer(@PathVariable ("dni") String dni, @RequestBody Customer customer){
         customerService.updateCustomerByDni(dni, customer);
    }

    @DeleteMapping("/{dni}")
    public void deleteCustomer(@PathVariable ("dni") String dni){
         customerService.deleteCustomerByDni(dni);
    }
}
