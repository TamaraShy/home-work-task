package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        String word1;
        for(int i =1; i< word.length();i++){
            word1 = word.substring(i,i+1).toUpperCase();
            {result = word1;}
        }
        return result;}


    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        String word1;
        for(int i =1; i< word.length();i++){
            word1 = word.substring(i,i+1).toLowerCase();
            {result = word1;}
        }
        return result;}

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        if (sentence == null || sentence.isEmpty())
            return sentence.substring(0,1).toUpperCase() + sentence.substring(1);
        return result;
    }
}
