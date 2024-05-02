package com.chaitanya.OrderService.controller;

import com.chaitanya.OrderService.model.OrderRequest;
import com.chaitanya.OrderService.model.OrderResponse;
import com.chaitanya.OrderService.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Log4j2
public class OrderController {

    @Autowired
    private OrderService orderService;

//    @PreAuthorize("hasAuthorize('Customer')")
    @PostMapping("/placeOrder")
    public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest orderRequest){
        long orderID = orderService.placeOrder(orderRequest);
        log.info("Order id : {}",orderID);
        return new ResponseEntity<>(orderID, HttpStatus.OK);
    }

//    @PreAuthorize("hasAuthorize('Customer') || hasAuthorize('Admin')")
    @GetMapping("/{orderId}")
    public ResponseEntity<OrderResponse> getOrderDetails(@PathVariable long orderId){
        OrderResponse orderResponse = orderService.getOrderDetails(orderId);
        return new ResponseEntity<>(orderResponse,HttpStatus.OK);
    }

//    @PreAuthorize("hasRole('Customer') || hasRole('Admin')")
    @GetMapping("/checking")
    public ResponseEntity<String> checking(){
        System.out.println("In here");
        return new ResponseEntity<>("Working",HttpStatus.OK);
    }

}
