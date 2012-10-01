package com.acme.coffee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.acme.coffee.domain.Coffee;
import com.acme.coffee.service.CoffeeRepository;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    CoffeeRepository repository;
    
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("coffees", repository.getAllCoffies());
        return "coffee/list";
    }
    
    @RequestMapping("/delete")
    public String delete(@RequestParam String coffee, HttpSession session) {
        
        repository.delete(coffee);
        session.setAttribute("msg", "You have succesfully deleted: " + coffee);
        return "redirect:/coffee/list";
    }
    
    @RequestMapping("/edit")
    public String edit(@RequestParam String coffee, Model model) {
        model.addAttribute("coffee", repository.findByName(coffee));
        return "coffee/edit";
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@RequestParam String name, @RequestParam Integer price, @RequestParam String imageUrl, HttpSession session) {
        
        System.out.println("about tu save ..");
        Coffee coffee = new Coffee(name, price, imageUrl);
        repository.add(coffee);
        session.setAttribute("msg", "You have succesfully added: " + coffee.getName());
       
        return "redirect:/coffee/list";
    }
}

