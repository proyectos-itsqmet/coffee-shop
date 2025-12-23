package com.itsqmet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
    private int id;
    private String name;
    private int stock;
    private double price;
    private int idCategory;
}
