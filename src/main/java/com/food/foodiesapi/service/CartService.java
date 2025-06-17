package com.food.foodiesapi.service;

import com.food.foodiesapi.io.CartRequest;
import com.food.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removefromCart(CartRequest cartRequest);
}
