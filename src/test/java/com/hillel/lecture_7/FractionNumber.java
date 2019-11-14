package com.hillel.lecture_7;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/8/19
 */
public class FractionNumber {

    private int a;

    private int b;

    @Override
    public String toString() {
        return "FractionNumber{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public FractionNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a + b;
    }

    public int aMinusB() {
        return a - b;
    }

    public int bMinusA() {
        return b - a;
    }

    public int multiply() {
        return a * b;
    }

    public int aDivB() {
        if(b == 0) throw new IllegalArgumentException("на ноль делить нельзя");
        return a / b;
    }

}



