package com.springdemo.aws.lambda.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int id;
    private String name;
    private double price;
    private int quantity;

    // TODO Auto-generated constructor stub
    public Order(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // TODO Auto-generated method stub
    public String getName() {
        return name;
    }
}
