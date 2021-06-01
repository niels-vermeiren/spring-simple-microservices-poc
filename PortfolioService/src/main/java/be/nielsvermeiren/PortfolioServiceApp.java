package be.nielsvermeiren;

import be.nielsvermeiren.controller.ProjectController;
import be.nielsvermeiren.proxy.CustomerServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PortfolioServiceApp {

    @Autowired
    ProjectController projectController;
    @Autowired
    CustomerServiceProxy customerServiceProxy;

    public static void main(String[] args) {
        SpringApplication.run(PortfolioServiceApp.class, args);
    }
}
