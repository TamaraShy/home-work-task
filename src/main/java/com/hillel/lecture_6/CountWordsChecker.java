package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker<counter> {

    @Step
    public int countNumberOfWorld(String sentence) {

//        TODO implements result
        int result = 0;
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;}{
                    result = result + count;
                }
            }
        return result;
    }
}