package ru.gb.model;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private String title;
    private int id;
    private float coast;
    private List<Product> children;
}
