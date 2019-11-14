package com.hillel.lecture_7;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
 public class FractionNumbersTestTask {
 private FractionNumber fractionNumber= new FractionNumber(40,20);
 @Step
 Assert.equals(fractionNumber.plus, 60);

 @Step
 Assert.equals(fractionNumber.aMinusB, 20);

 @Step
 Assert.equals(fractionNumber.bMinusA, -20);

 @Step
 Assert.equals(fractionNumber.multiply, 800);

 @Step
 Assert.equals(fractionNumber.aDivB, 2);

}
