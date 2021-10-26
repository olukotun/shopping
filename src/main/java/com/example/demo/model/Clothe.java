package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Clothe {
    private Integer id;
    private String title;
    private String routeName;
    private List<Item> items;
}
