package ru.sberbank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String helloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    @ModelAttribute
    public String goodByePage(Model model) {
        model.addAttribute("name", "Sasha");
        return "first/goodbye";
    }


}
