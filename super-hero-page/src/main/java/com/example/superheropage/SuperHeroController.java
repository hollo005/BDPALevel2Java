package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", "WonderWoman");
        model.addAttribute("power1", "Can speak all languages including to animals");
        model.addAttribute("power2", "Heals super fast");
        model.addAttribute("power3", "Super human strength, speed and can fly!!!");
        model.addAttribute("fact1", " She was born on an island called Themyscira");
        model.addAttribute("fact2", "WonderWoman is Amozazonian");
        model.addAttribute("fact3", "She dated SuperMan for a few years ");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
