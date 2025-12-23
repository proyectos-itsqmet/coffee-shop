package com.itsqmet.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactModel {

    private int id;

    @Size(min = 10, max = 120)
    private String fullName;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
    @Size(min = 10, max = 120)
    private String email;

    @Pattern(regexp = "^[0-9]+$")
    private String phone;

    @Size(min = 10, max = 100)
    private String subject;

    @Size(min = 10, max = 400)
    private String message;

}
