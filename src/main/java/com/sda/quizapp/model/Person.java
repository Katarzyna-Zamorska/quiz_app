package com.sda.quizapp.model;

import com.sun.istack.NotNull;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Embeddable
public class Person {

    @NotNull
    @NotBlank
    @Pattern(regexp = "[A-Z][a-z]+", message = "First letter should be capital")
    private String name;

    @NotNull
    @NotBlank
    @Pattern(regexp = "[A-Z][a-z]+", message = "First letter should be capital")
    private String lastname;

    @NotNull
    @NotBlank
    @Pattern(regexp = ".+@.+\\.pl")
    private String email;
}
