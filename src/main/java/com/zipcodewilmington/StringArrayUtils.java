package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
//        String [] resultReverse = array;
//        for (int i = 0; i < resultReverse.length / 2; i++){
//            String temp = resultReverse[i];
//            resultReverse[i] = resultReverse[resultReverse.length - i - 1];
//            resultReverse[resultReverse.length - i - 1] = temp;
//        }
//        return resultReverse;
        ArrayList <String> resultReverse = new ArrayList<String>();
        for (int i = array.length - 1; i >= 0; i--){
            resultReverse.add(array[i]);
        }
        return resultReverse.toArray(new String[resultReverse.size()]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
//        String [] result = StringArrayUtils.reverse(array25);
//        System.out.println(Arrays.toString(array25));
//        System.out.println(Arrays.toString(result));
//        boolean reSult = array25 == result;
//        System.out.println(reSult);
//        return reSult;

//        ArrayList<String> resultReverse2 = new ArrayList<>();
//        for (int i = 0; i < array25.length / 2; i++){
//            resultReverse2.add(array25[i]);

//            String temp = resultReverse2[i];
//            resultReverse2[i] = resultReverse2[resultReverse2.length - i - 1];
//            resultReverse2[resultReverse2.length - i - 1] = temp;
//        }
//        resultReverse2.toArray(new String[resultReverse2.size()]);
//        System.out.println(Arrays.toString(array25));
//        System.out.println(Arrays.toString(resultReverse2));
        return Arrays.equals(StringArrayUtils.reverse(array), array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
