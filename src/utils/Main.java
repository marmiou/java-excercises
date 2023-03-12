package utils;

import jdk.internal.util.xml.impl.Pair;

import java.math.BigInteger;
import java.security.Timestamp;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws myCustomExceptions {
        System.out.println("Hello world!");

        // Lists exercises
        MyLists myLists = new MyLists();

        //count length of a list
        List<String> myList = Arrays.asList("sup1", "sup2", "sup3");

        System.out.println(myLists.countListLength(myList));

        //multiply items in a int list
        List<Integer> intList = Arrays.asList(5, 2, 0, 4, 5, 8, 1);
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
        List<Integer> integerList = Arrays.asList(4, 6, 3, 7, 8, 8, 9, 2, 3, 5, 6, 7, 81, 2, 3, 5, 67, 2, 7, 2);
        System.out.println(myLists.removeDuplicates(integerList));

        //Check if list is empty
        System.out.println(myLists.checkIsEmpty(integerList));

        //Take two lists and return Common members if they have at least one common member
        List<Integer> integerList1 = Arrays.asList(4, 6, 3, 7, 8, 8, 9, 2, 3, 5, 6, 7, 81, 2, 3, 5, 67, 2, 7, 2);
        List<Integer> integerList2 = Arrays.asList(4, 222, 666, 1);
        System.out.println(myLists.checkAtLeastOneCommonMember(integerList1, integerList2));


        // Get the difference between the two lists:
//        List<Integer> integerListOne = Arrays.asList(4,6,3,7,8,8,9,2,3,5,6,7,81,2,3,5,67,2,7,2);
//        List<Integer> integerListTwo = Arrays.asList(4,222,666,1);
//        System.out.println(myLists.getDifference(integerListOne,integerListTwo));

        //Access index and value:
        System.out.println(myLists.accessIndexAndValue(integerList1));

        // String exercises
        MyStrings myStrings = new MyStrings();
        String name = "markella";
        System.out.println(myStrings.reverse(name));


        System.out.println(100 + 100 +"Simplilearn");
        System.out.println("E-Learning Company" + 100 + 100);

        //Exceptions

        //Arithmetic Exception
        int x = 100;
        int y = 0;  // denominator is set to zero
        try {
            System.out.println(x / y);
        } // throws ArithmeticException}
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        //NullPointerException
        String data = null;
        try {
            System.out.println(data.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        }

        //ClassCastException
        //todo

        //DateTimeException
        try {
            LocalDate now = LocalDate.now();
            DateTimeFormatter.RFC_1123_DATE_TIME.format(now);
        } catch (DateTimeException e) {
            System.out.println("DateTime Exception");
        }

        //ArrayIndexOutOfBoundsException
        try {
            String[] myData = new String[5];
            myData[6] = "More Data";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
        }

        //NegativeArraySizeException
        try {
            String[] data1 = new String[-5]; // throws Runtime Exception
            data1[1] = "More Data";
        }
        catch(RuntimeException e) {
            System.out.println("NegativeArraySizeException");
        }

        //ArrayStoreException
        try{
            Number[] bigInt = new BigInteger[5]; //to avoid exception we can declare BigInt[] array
            bigInt[0] = Double.valueOf(12345);}
        catch(ArrayStoreException e){
            System.out.println("ArrayStoreException");
        }

        //NoSuchElementException
        try{
            Set set = new HashSet<>();
            set.iterator().next(); // Java runtime exception thrown
        }
        catch(NoSuchElementException e){
            System.out.println("NoSuchElementException");
        }

        //Custom exception handling
        try {
            int number = integerList2.get(5);
            System.out.println(number);
        } catch (Exception e) {
            throw new myCustomExceptions("List index is out of range");
        } finally {
            System.out.println("this part of code will run in any case");
        }


    }
}
