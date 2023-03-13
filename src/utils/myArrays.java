package utils;

import java.util.Arrays;

public class MyArrays {

    public void sortArray(int[] myArray) {
        Arrays.sort(myArray);
    }

    public void sortArray(String[] myArray) {
        Arrays.sort(myArray);
    }

    public int getMAxValueInSorted(int[] myArray) {
        int[] sorted = Arrays.stream(myArray).sorted().toArray();
        return sorted[myArray.length - 1];
    }

    public int getMaxValueInUnsorted(int[] myArray) {
        final int[] max = {myArray[0]};
        Arrays.stream(myArray).forEach(item -> {
            if (item > max[0]) {
                max[0] = item;
            }
        });
        return max[0];
    }

    public Boolean checkOccurence(Character[] charArray, char character) {
        return Arrays.stream(charArray)
                .anyMatch(item -> item == character);
    }

    public int[] reverse(int[] intArray) {
        //1) Initialize start and end indexes as start = 0, end = n-1
        //2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
        //start = start +1, end = end – 1
        int start = 0;
        int end = intArray.length - 1;
        while (start < end) {
            int temp = intArray[start];
            intArray[start] = intArray[end];
            intArray[end] = temp;
            start++;
            end--;
        }
        return intArray;
    }

    public char[] reverse(char[] charArray) {
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return charArray;
    }
}
