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
}
