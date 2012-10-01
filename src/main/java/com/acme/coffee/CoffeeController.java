package com.acme.coffee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @RequestMapping("/{coffee}")
    public String edit(@PathVariable String coffee, Model model) {
        model.addAttribute("coffee", repository.findByName(coffee));
        return "coffee/edit";
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@ModelAttribute Coffee coffee, BindingResult bindingResult, HttpSession session) {

        if (coffee.getName().contains(" ")) {
            bindingResult.addError(new FieldError("coffee", "name", "Please don't use space inside of the name"));
        }
        if (bindingResult.hasErrors()) {
            return "coffee/edit";
        } else {
            repository.add(coffee);
            session.setAttribute("msg", "You have succesfully added: " + coffee.getName());
        }
       
        return "redirect:/coffee/list";
    }
    
    @RequestMapping("/new")
    public String add(Model model) {
        
        model.addAttribute("coffee", new Coffee());
        
        return "coffee/edit";
    }
}

