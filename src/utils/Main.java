package utils;

import jdk.internal.util.xml.impl.Pair;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Lists exercises
        MyLists myLists = new MyLists();

        //count length of a list
        List<String> myList = Arrays.asList("sup1", "sup2", "sup3");

        System.out.println( myLists.countListLength(myList));

        //multiply items in a int list
        List<Integer> intList = Arrays.asList(5,2,0,4,5,8,1);
        System.out.println(myLists.multiplyItemsInList(intList));

        //get minimum and max number
        List<Integer> intList1 = Arrays.asList(5, 2, 0, 4, 5, 8, 1);
        System.out.println(myLists.getMinNumber(intList1));
        System.out.println(myLists.getMaxNumber(intList1));

        // Count the number of strings where the string length is 2 or more and the first and last character are same
        //from a given list of strings
        List<String> myList1 = Arrays.asList("sup1", "sup2", "sup3", "l", "alla", "markellam", "alla1", "tralala", "opiueiwuewo");
        System.out.println(myLists.countStringsWithLastFirstChar(myList1));

        //remove list duplicates
        List<Integer> integerList = Arrays.asList(4,6,3,7,8,8,9,2,3,5,6,7,81,2,3,5,67,2,7,2);
        System.out.println(myLists.removeDuplicates(integerList));
        
    }
}
