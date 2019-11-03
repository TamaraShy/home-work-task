package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    @Step
    public String getGreatestNumber(int a, int b) {

//        TODO implements result
        String result = "";
        if (a>b){
        return result = "The number" + a + "has the greatest value";
    } else {return result = "The number" + b + "has the greatest value}
}
