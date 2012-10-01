package com.acme.coffee.service;

import java.util.Collection;

import com.acme.coffee.domain.Coffee;

public interface CoffeeRepository {

    public Collection<Coffee> getAllCoffies();

    public void delete(String coffee);
    
    public void add(Coffee coffee);
}