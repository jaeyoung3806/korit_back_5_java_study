package com.study.test;

public class Factory {
    private static Factory instance;

    private String factoryName;

    private Factory() {
    }

    public static Factory getInstance() {
        if(instance == null){
            synchronized (Factory.class){
                instance = new Factory();
            }
        }
        return instance;
    }

}
