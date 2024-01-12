package com.study.ch11;

public class Company {
    String name;

    void  setName(String name) {
        this.name = name;

    }
    void showCompanyInfo(){

    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
