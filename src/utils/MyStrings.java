package utils;

import java.util.HashMap;

public class MyStrings {

    public String reverse(String myString) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myString);
        return stringBuilder.reverse().toString();
    }

    public Boolean checkPalindrome(String myString) {
        if (myString.equals(reverse(myString))) {
            return true;
        } else {
            return false;
        }
    }

    public int findOccurrences(String myString, Character character) {
        char[] splitString = myString.toCharArray();
        int total = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (character.equals(splitString[i])) {
                total = total + 1;
            }
        }
        return total;
    }

    // 1.Create a new Hashmap of key value : character, integer
    // 2. Iterate the string characters. Get current character
    // 3. If map contains already current character, then get old value of char key. Save new value to now and increase value into Hashmap
    // 4. If not, then save current character to map with value 1;
    // Now we have Hashmap with occurences per key char.
    // 5. Initialize a max char at first position of string
    // 6. Iterate map and if key value > max value, save key to max

    public char findMaxOccurrence(String myString) {
        HashMap<Character, Integer> charIntMap = new HashMap<>();
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (charIntMap.containsKey(currentChar)) {
                int old = charIntMap.get(currentChar);
                int now = old + 1;
                charIntMap.put(currentChar, now);
            } else {
                charIntMap.put(currentChar, 1);
            }
        }
        char max = myString.charAt(0);
        for (Character key : charIntMap.keySet()) {
            if (charIntMap.get(key) > charIntMap.get(max)) {
                max = key;
            }
        }
        return max;
    }

}
