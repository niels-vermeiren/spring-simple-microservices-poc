package be.nielsvermeiren;

import be.nielsvermeiren.controller.CustomerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApp{
    @Autowired
    CustomerController controller;

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApp.class, args);
    }
}
