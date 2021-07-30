package com.epam.avia.validation;

public class Validation {
    public static void validation(Double price, Double capacity)
        throws IllegalArgumentException{
         if (price<=0){
             throw new IllegalArgumentException("Not enough money = " + price);
         }
        if (capacity<=0){
            throw new IllegalArgumentException("Not enough capacity = " + capacity);
        }
    }
}

