package com.study.ch14;

import java.util.Objects;
import java.util.Scanner;

/**
 * object 클래스
 * 자바의 모든 클래스는 object 클래스를 기본적으로 상속받고 있다.
 */
public class ObjectTest {

    private String name;
    private String adress;

    public ObjectTest(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress);
    }
}
