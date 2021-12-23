package com.example.gittest.service;

import com.example.gittest.entity.InsuranceContract;

public class InsuranceContractService {

    public com.example.gittest.entity.InsuranceContract createContract(){
        System.out.println("test");
        return  new InsuranceContract();
    }
}
