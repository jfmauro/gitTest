package com.example.gittest.service;

import com.example.gittest.entity.Person;

public class PersonService {

    public boolean addPerson(Person p){
        System.out.println("new person added.");
        return true;
    }

    public Person findPersonById(Long id){
        return new Person();
    }
}
