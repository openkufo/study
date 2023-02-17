package com.paulhan.encapsulation;

public class Person {
    private String name;
    
}

class Sepecial{
    private Sepecial sepecial;
    
    Sepecial(){

    }

    public Sepecial getInstance(){
        if(sepecial == null){
            return new Sepecial();
        }

        return sepecial;
    }
}