package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
    private Integer id;
    private String name;
    private String imageUrl;
    private Integer price;
}
