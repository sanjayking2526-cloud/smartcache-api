package com.smartcache.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    // 1. எல்லா ஃபுட் ஐட்டம்ஸையும் பார்க்க
    @GetMapping("/all")
    public List<FoodItem> getAllFood() {
        return foodService.getAllFoodItems();
    }

    // 2. புதுசா ஒரு ஐட்டமை ஆட் பண்ண (ID கன்ஃப்ளிக்ட் வராம இருக்க null செட் பண்ணியிருக்கேன் மச்சான்)
    @PostMapping("/add")
    public FoodItem addFood(@RequestBody FoodItem foodItem) {
        foodItem.setId(null); 
        return foodService.saveFoodItem(foodItem);
    }
}
