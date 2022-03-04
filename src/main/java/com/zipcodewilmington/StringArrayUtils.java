package com.zipcodewilmington;

import java.util.*;

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
        return Arrays.equals(StringArrayUtils.reverse(array), array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Boolean lowerCase;
        Boolean upperCase;
        Boolean result = true;
        String arrayString = Arrays.toString(array);
        for (int i = 0; i < 26; i++){
            upperCase = arrayString.contains(Character.toString((char)('A' + i)));
            lowerCase = arrayString.contains(Character.toString((char)('a' + i)));
            result = (upperCase) || (lowerCase);
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int countValue = 0;
        for (String string: array){
            if (string.contains(value)){
                countValue++;
            }
        }
        return countValue;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> alteredArray = new ArrayList<String>(Arrays.asList(array));
        alteredArray.remove(valueToRemove);
        array = alteredArray.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> consecRemoved = new ArrayList<String>();
        consecRemoved.add(array[0]);
        for (int i = 1; i <= array.length - 1; i++){
           if (!Objects.equals(array[i], array[i - 1])){
               consecRemoved.add(array[i]);
           }
        }
        return consecRemoved.toArray(new String[consecRemoved.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
