package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {
        String result= "";
        if (number<= to && number>=from)
        {return result = "Number" + number+ "belong to interval [-5;3]";}
        else{ return result = "Number" + number+ "is not belong to interval [-5;3]";
        }
    }
}
