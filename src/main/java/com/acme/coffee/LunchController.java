package com.acme.coffee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LunchController {

    @RequestMapping("/lunch")
    public String lunch(Model model) {
        model.addAttribute("msg", "Spring mvc Model rulez");
        return "lunch";
    }
}
