package com.ahmetsezer.springrestapi.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Employee {

    private String id;

    private String firstName;

    private String lastName;


    public Employee(String number, String ahmet, String sezer) {

    }
}

