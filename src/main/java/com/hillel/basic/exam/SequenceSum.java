package com.hillel.basic.exam;

import com.sun.xml.internal.rngom.digested.DValuePattern;

/**
 * Description:
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * which is created by
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input: LastNumber
 * Output: series and result
 * <p>
 * Example:
 * <p>
 * Input: 6
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: -15
 * Output: -15 < 0
 * <p>
 * Input: > 0
 * Output: 0 = 0
 */

public class SequenceSum {

    public static String showSequence(int value) {
        String result = "";
        int sum = 0;

        if (value < 0) {
            return result = value + " < 0";
        } else if (value == 0) {
            return result = value + " < 0";
        } else {
            for (int i = 0; i <= value; i++) {
                if (i == 0) {
                    result = result + i;
                } else {
                    result = result + "+" + i;
                }
                sum = sum + i;
            }
            result = result + " = " + sum;
        }
        return result;
    }