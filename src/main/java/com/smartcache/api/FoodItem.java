package com.smartcache.api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "items")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private Double price;
    private String description;

    // Getter and Setter for ID
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }

    // Getter and Setter for Name
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    // Getter and Setter for Price
    public Double getPrice() { 
        return price; 
    }
    public void setPrice(Double price) { 
        this.price = price; 
    }

    // Getter and Setter for Description
    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }
}