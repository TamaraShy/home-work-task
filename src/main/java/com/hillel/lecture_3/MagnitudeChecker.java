package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        double maga = Math.abs(a);
        double magb = Math.abs(b);
        if (maga > magb) {
            return result = "The number " + a + " has the greatest magnitude!";
        } else if (maga < magb) {
            return result = "The number " + b + " has the greatest magnitude!";
        } else return result = "The number " + a + " and " + b + " are equals by magnitude!";
    }
}

