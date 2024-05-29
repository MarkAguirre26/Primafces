package com.virtual.primefaces;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@RequestScoped
@Named
public class HelloBean {

    public String sampleOutPut(){
        return  "Hi Mark, From bean test jsf";
    }

}
