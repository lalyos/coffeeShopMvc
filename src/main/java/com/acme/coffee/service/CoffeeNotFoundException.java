package com.acme.coffee.service;

public class CoffeeNotFoundException extends RuntimeException {

    public CoffeeNotFoundException(String coffee) {
        super("Coffee not found: " + coffee);
    }
}
