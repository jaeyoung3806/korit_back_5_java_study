package com.study.ch19;

public class OrderMain {
    public static void main(String[] args) {
        Order.OrderBuilder orderBuilder = Order.builder();
        Order order = Order.builder()
                .orderId(100)
                .productName("Samgsung Galaxbook2 Pro")
                .consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();
        System.out.println(order);
    }
}
