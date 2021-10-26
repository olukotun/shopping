package com.example.demo.controller;

import com.example.demo.model.Clothe;
import com.example.demo.shopService.ShopService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/fakeDb/getClothes")
    public List<Clothe> getStocks () throws IOException {
        return shopService.getAllClothe();
    }
}
