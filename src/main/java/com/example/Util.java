package com.example;

public class Util {

    /**package com.example;
//Other
import java.util.Arrays;

public class Util {

    /**
     * Multiplies two numbers
     * @param nums numbers to add
     * @return int Result of adding all elements of nums
     */
    public static int multiply(int... nums) {
        return Arrays.stream(nums).reduce(1,(sum,n) -> sum+n);
    }
}