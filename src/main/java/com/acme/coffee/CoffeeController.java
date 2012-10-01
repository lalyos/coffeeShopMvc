package com.acme.coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acme.coffee.service.CoffeeRepository;

@Controller
public class CoffeeController {

    @RequestMapping("/coffee/list")
    public String list() {
        return "coffee/list";
    }
}

