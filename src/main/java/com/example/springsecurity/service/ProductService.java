package com.example.springsecurity.service;

import com.example.springsecurity.Repo.UserDataRepo;
import com.example.springsecurity.dto.Product;
import com.example.springsecurity.entity.UserData;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {

    List<Product> productList = null;

    @Autowired
    private UserDataRepo userDataRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostConstruct
    public void loadProductsFromDB(){
        productList = IntStream.rangeClosed(1,100)
                .mapToObj(i -> Product.builder()
                        .productId(i)
                        .name("product" + i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000)).build())
                .collect(Collectors.toList());
    }

    public List<Product> getProducts(){
        return productList;
    }

    public Product getProduct(int id){
        return productList.stream()
                .filter(product -> product.getProductId()==id)
                .findAny()
                .orElseThrow(()-> new RuntimeException("product" + id+ "not found"));
    }

    public String addUser(UserData userData){
        userData.setPassword(passwordEncoder.encode(userData.getPassword()));
        userDataRepo.save(userData);
        return "user added to system";
    }
}
