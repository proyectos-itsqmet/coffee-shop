package com.itsqmet.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
    private int id;
    @Size(min = 5, max = 10)
    private String name;

    @Pattern(regexp = "^[0-9]+$")
    private int stock;

    @Pattern(regexp = "^[0-9]+$")
    private double price;

    @Size(min = 1, max = 10)
    private int idCategory;
}
