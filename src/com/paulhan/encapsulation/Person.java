package com.paulhan.encapsulation;

public class Person {
    private String name;
    public void test(){
        System.out.println("test");
    }
}

class Special{
    private Special sepecial;
    
    Special(){

    }

    public Special getInstance(){
        if(sepecial == null){
            return new Special();
        }

        return sepecial;
    }
}