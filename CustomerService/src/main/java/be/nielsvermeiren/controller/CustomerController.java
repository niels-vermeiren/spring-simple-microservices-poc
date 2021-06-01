package be.nielsvermeiren.controller;

import be.nielsvermeiren.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public List<Customer> getCustomers() {
        return Arrays.asList(new Customer("niels", 1L));
    }

}
