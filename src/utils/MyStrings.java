package utils;

public class MyStrings {

    public String reverse(String myString){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myString);
        return stringBuilder.reverse().toString();
    }
}
