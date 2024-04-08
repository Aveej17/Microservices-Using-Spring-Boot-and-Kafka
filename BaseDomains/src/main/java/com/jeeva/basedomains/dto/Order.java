package com.jeeva.basedomains.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderId;

    private String name;

    //Order Quantity
    private int qty;

    private double price;
}
