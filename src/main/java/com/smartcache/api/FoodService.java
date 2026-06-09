package com.smartcache.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    // எல்லா ஃபுட் ஐட்டம்ஸையும் லிஸ்ட் எடுக்க
    public List<FoodItem> getAllFoodItems() {
        return foodRepository.findAll();
    }

    // ID வச்சு குறிப்பிட்ட ஒரு ஃபுட் ஐட்டமை மட்டும் எடுக்க
    public Optional<FoodItem> getFoodItemById(Long id) {
        return foodRepository.findById(id);
    }

    // புதுசா ஒரு ஃபுட் ஐட்டமை (உதாரணத்துக்கு சிக்கன் பிரியாணி) டேட்டாபேஸ்ல ஆட் பண்ண
    public FoodItem saveFoodItem(FoodItem foodItem) {
        return foodRepository.save(foodItem);
    }
}
