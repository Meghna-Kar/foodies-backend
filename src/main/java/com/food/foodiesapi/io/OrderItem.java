package com.food.foodiesapi.io;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItem {

    private String foodId;
    private int quantity;
    private double price;
    private String Category;
    private String imageUrl;
    private String description;
    private String name;
}
