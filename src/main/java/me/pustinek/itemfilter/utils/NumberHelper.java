package me.pustinek.itemfilter.utils;

public class NumberHelper {

    /**
     * This simple function gets the smallest multiple of 9 greater than its input value.
     *
     * @param value number value
     * @return closest multiple of 9 greater than value
     */
    public static int nextMultipleOf9(int value) {
        int multipleOfNine = 9;
        while (multipleOfNine < value) {
            multipleOfNine += 9;
        }
        return multipleOfNine;
    }


    public static int ensureRange(int value, int min, int max) {
        return Math.min(Math.max(value, min), max);
    }

}
