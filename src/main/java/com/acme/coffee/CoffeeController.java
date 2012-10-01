package com.acme.coffee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acme.coffee.service.CoffeeRepository;

@Controller
@RequestMapping("/coffee/*")
public class CoffeeController {

    @Autowired
    CoffeeRepository repository;
    
    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("coffees", repository.getAllCoffies());
        return "coffee/list";
    }
    
    @RequestMapping("delete")
    public String delete(HttpServletRequest request, HttpSession session) {
        
        String coffee = request.getParameter("coffee");
        repository.delete(coffee);
        session.setAttribute("msg", "You have succesfully deleted: " + coffee);
        return "redirect:/coffee/list";
    }
}

