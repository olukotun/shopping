package com.example.demo.shopService;

import com.example.demo.model.Clothe;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class ShopService {

    public List<Clothe> getAllClothe() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Clothe> getAllStocks = objectMapper.readValue(new File("C:\\Users\\oluko\\Downloads\\clothingApp\\src\\main\\resources\\mock\\sections.json"),new TypeReference<List<Clothe>>(){});
        return getAllStocks;
    }
}
