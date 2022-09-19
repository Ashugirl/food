package com.example.food.service;

import com.example.food.model.Food;

public class FoodService {

    public Food[] getFoods(){
        Food[] foods = {new Food("pizza", 12.00), new Food("curry", 8.99), new Food("beer", 4.50)};
        return foods;
    }
}
