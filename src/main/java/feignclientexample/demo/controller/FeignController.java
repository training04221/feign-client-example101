package feignclientexample.demo.controller;


import feignclientexample.demo.client.Clients;
import feignclientexample.demo.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private Clients client;


    @GetMapping(value = "/allUsers")
    public List<UserResponse> getUsers() {

        return client.getAllUsers();
    }


}
