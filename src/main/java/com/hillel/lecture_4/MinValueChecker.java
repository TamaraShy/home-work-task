package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
        int result = 0;
        int ar_min = data [0];
        for(int i = 0; i < data.length; i++) {
            if(data[i] < ar_min)
                ar_min = data[i];
        }
        return ar_min;
        }
    }