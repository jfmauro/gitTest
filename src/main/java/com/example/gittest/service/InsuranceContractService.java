package com.example.gittest.service;

import com.example.gittest.entity.InsuranceContract;
import com.example.gittest.entity.Person;

public class InsuranceContractService {

    PersonService personService;

    public com.example.gittest.entity.InsuranceContract createContract(Long personId){
        System.out.println("test8");
        PersonService personService = new PersonService();
        final Person person = personService.findPersonById(personId);
        System.out.println("test2");
        return  new InsuranceContract();
    }
}
