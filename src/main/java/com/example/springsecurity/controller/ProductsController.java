package com.example.springsecurity.controller;

import com.example.springsecurity.dto.Product;
import com.example.springsecurity.entity.UserData;
import com.example.springsecurity.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService service;
    @GetMapping("/hello")
    public String hello(){
        return "Hello this endpoint is not safe";
    }

    @GetMapping("/getAll")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/get/{id}")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Product getProductById(@PathVariable int id){
        return service.getProduct(id);
    }

    @PostMapping("/addUser")
    public String addNewUser(UserData userData){
        return service.addUser(userData);
    }
}
