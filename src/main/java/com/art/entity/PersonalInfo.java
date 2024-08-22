package com.art.entity;


import java.time.LocalDate;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class PersonalInfo {

    private LocalDate birthDate;

    private LocalDate deathDate;

    private String nationality;
}
