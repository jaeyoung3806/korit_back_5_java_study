package com.study.ch19;


import lombok.ToString;


@ToString


public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() {
        return new CarBuilder();

    }

    public static class CarBuilder{ //내부 클래스
        private String model;
        private String color;


        public Car build(){
            return new Car(model, color);

        }
        public CarBuilder model(String model){
            this.model = model;
            return this;
        }
        public CarBuilder color(String color){
            this.model = color;
            return this;
        }

    }
}
