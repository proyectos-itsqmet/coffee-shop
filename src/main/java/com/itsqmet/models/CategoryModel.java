package com.itsqmet.models;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {
    private int id;

    @Size(min = 10, max = 120)
    private String name;
}
