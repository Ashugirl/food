package com.example.food.controller;

import com.example.food.model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("message", "Hello! Welcome to the food controller.");
        Food[] foods = {new Food("pizza", 12.00), new Food("curry", 8.99), new Food("beer", 4.50)};
        model.addAttribute("foods", foods);
        return "home";
    }
}
