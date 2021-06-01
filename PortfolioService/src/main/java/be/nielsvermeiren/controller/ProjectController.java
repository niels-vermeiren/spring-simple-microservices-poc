package be.nielsvermeiren.controller;

import be.nielsvermeiren.domain.Customer;
import be.nielsvermeiren.domain.Project;
import be.nielsvermeiren.proxy.CustomerServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private CustomerServiceProxy customerServiceProxy;

    @GetMapping("/project")
    public List<Project> getAllProjects() {
        List<Customer> customers = customerServiceProxy.getCustomers().getBody();
        String name = customers.get(0).getName();
        String[] technologies = new String[3];
        technologies[0] = "cpp";
        technologies[1] = "qt";
        technologies[2] = name;
        return Arrays.asList(new Project("chess game", technologies));
    }

}
