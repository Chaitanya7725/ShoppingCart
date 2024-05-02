package com.chaitanya.OrderService.service;

import com.chaitanya.OrderService.model.OrderRequest;
import com.chaitanya.OrderService.model.OrderResponse;

public interface OrderService {

    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
