package com.acme.coffee.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.acme.coffee.domain.Coffee;

public class SimpleCoffeeRepository implements CoffeeRepository {

    Map<String, Coffee> coffees = new ConcurrentHashMap<String, Coffee>();
    
    @PostConstruct
    public void init() {
        addCoffe("illy", 112, "http://upload.wikimedia.org/wikipedia/en/thumb/e/ee/Illy_logo.jpg/200px-Illy_logo.jpg");
        addCoffe("sega", 120, "http://www.coffeeamp.com/wp-content/uploads/2010/02/segafredo-logo1.jpg");
        addCoffe("nesquuick", 230, "http://upload.wikimedia.org/wikipedia/en/d/dd/Nesquik_Logo.jpg");
        addCoffe("maci", 89, "http://www.vitalabc.hu/attachment/0003/2582_maci_gyerekkave.jpg");
        addCoffe("starbuksz", 890, "http://www.blonde20.com/blog/wp-content/uploads/2010/01/starbucks-logo.jpg");
    }
    
    public Collection<Coffee> getAllCoffies() {
        return coffees.values();
    }
    
    private void addCoffe(String name, int price, String url) {
        
        Coffee coffee = new Coffee(name, price, url);
        coffees.put(name, coffee);
    }

}
