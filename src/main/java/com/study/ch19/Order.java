package com.study.ch19;


public class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public Order(int orderId, String productName, String consumerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", consumerName='" + consumerName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder{
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public Order build(){
                return new Order(orderId, productName, consumerName, price, stock);
        }
        public Order.OrderBuilder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }
        public Order.OrderBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }
        public Order.OrderBuilder consumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public Order.OrderBuilder price(int price) {
            this.price = price;
            return this;
        }
        public Order.OrderBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }


    }
}
