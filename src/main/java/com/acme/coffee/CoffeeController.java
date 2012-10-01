package com.acme.coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acme.coffee.service.CoffeeRepository;

@Controller
public class CoffeeController {

    @Autowired
    CoffeeRepository repository;
    
    @RequestMapping("/coffee/list")
    public String list(Model model) {
        model.addAttribute("coffees", repository.getAllCoffies());
        return "coffee/list";
    }
}

