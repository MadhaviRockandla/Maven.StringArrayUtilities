package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

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
        for (String num : array)
        {
            if (num.equals(value))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array)
    {
        String[] reverse = new String[array.length];
        for (int i = 0; i < array.length/2 ; i++)
        {
            reverse[i] =array[array.length - 1];

            reverse[reverse.length - 1] = array[i];
        }
        return reverse;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array)
    {
        int len = array.length;
        for(int i =0; i< (len/2);i++){
            if(!array[i].equals(array[len - i - 1])){
                return false;
            }
        }
        return true;
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
            int count = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i].equals(value)){
                    count++;
                }
            }
            return count;
        }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

            String[] result = new String[array.length-1];
            int resultIndex = 0;
            for(int i = 0; i < array.length; i++){
                if(!array[i].equals(valueToRemove)){
                    result[resultIndex++] = array[i];
                }
            }
            return result;
        }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < array.length - 1; i++) {
                if (!array[i].equals(array[i + 1])) {
                    list.add(array[i]);
                }
            }
            list.add(array[array.length - 1]);
            return list.toArray(new String[list.size()]);
        }

    }
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
