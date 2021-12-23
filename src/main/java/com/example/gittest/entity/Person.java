package com.example.gittest.entity;

import com.example.gittest.enume.PersonStatus;

import java.util.List;

public class Person {
    private Long id;
    private String username;
    private String password;
    private PersonStatus status;
    private List<InsuranceContract> insuranceContracts;
}
