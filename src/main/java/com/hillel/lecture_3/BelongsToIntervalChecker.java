package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {
        String result = "";
        int a = 2;
        int to = -5;
        int from = 3;
        if (a<= to && a>=from)
        return result = "Number" + a+  "belong to interval [-5;3]";
        else{ result = "Number" + a+  "is not belong to interval [-5;3]";
        }
    }
}
