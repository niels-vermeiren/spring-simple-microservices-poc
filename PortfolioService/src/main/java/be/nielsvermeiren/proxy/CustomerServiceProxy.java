package be.nielsvermeiren.proxy;

import be.nielsvermeiren.domain.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="customer-service", url="http://localhost:8090")
public interface CustomerServiceProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    ResponseEntity<List<Customer>> getCustomers();
}

