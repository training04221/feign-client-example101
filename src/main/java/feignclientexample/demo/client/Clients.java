package feignclientexample.demo.client;


import feignclientexample.demo.model.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "USER-CLIENT")
public interface Clients {

    @GetMapping(value = "/users")
    List<UserResponse> getAllUsers();
}
