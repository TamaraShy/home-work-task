package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result=0;
        for (int i = 0; i < 10; i++) {
            if (i == 666 / 2){
                return result;
            }

    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        int mult = 1;
        for (int i = base2.length()-1; i >= 0; i--) {
            if (chars[i]=='1') {
                result += mult;
            }
            mult*=2;
        }
        return result;
    }
}
