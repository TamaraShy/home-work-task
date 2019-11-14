package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static long rotate(long n) {
        return 0;
    }

    String replaceLeft(String str, int up) {
        StringBuilder rotate = new StringBuilder();
        int i = up;
        if (str.length() == 1)
            return str;
        do {
            rotate.append(str.charAt(i));
            i = (i + 1) % str.length();
        } while (i != up);
        return String.valueOf(rotate);
    }

    public static long maxRot(long n) {
        String number = Long.toString(n);
        int length = number.length();
        int count = 0;
        Long max = n;
        while (count < length) {
            String subString = number.substring(count, length);
            subString = replaceLeft(subString, 1);
            number = number.substring(0,count) + subString;
            Long rotatedNum = Long.parseLong(number);
            if (rotatedNum > max)
                max = rotatedNum;
            count++;
        }
        return max;
    }
}
