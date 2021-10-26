package com.example.demo;

import com.example.demo.model.Clothe;
import com.example.demo.shopService.ShopService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication

public class ApiClothingApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ApiClothingApplication.class, args);
        ShopService shopService = new ShopService();
        List<Clothe> all = shopService.getAllClothe();

        System.out.println(all);
    }

}
