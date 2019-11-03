package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        if (a == 0) {
            x1 = -c / b;
            System.out.println("x = " + x1);
        } else {
            discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < 0) {
                System.out.println("There is no answer");
            } else if (discriminant == 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1=x2= " + x1);
            } else if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1 = " + x1);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x2 = " + x2);
            }
    }

}
