package utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MyLists {

    public int countListLength(List<String> myList) {
        return myList.size();
    }

    public int multiplyItemsInList(List<Integer> myList) {
        AtomicInteger total = new AtomicInteger(1);
        myList.forEach(item -> total.set(total.get() * item));
        return total.get();
    }

    public List<Integer> sortList(List<Integer> myList) {
        Collections.sort(myList);
        return myList;
    }

    public int getMinNumber(List<Integer> myList) {
        List<Integer> sortedList = sortList(myList);
        return sortedList.get(0);
    }

    public int getMaxNumber(List<Integer> myList) {
        List<Integer> sortedList = sortList(myList);
        return sortedList.get(sortedList.size() - 1);
    }

    public int countStringsWithLastFirstChar(List<String> myList) {
        AtomicInteger total = new AtomicInteger();
        myList.forEach(str -> {
            if (str.charAt(0) == str.charAt(str.length() - 1) && str.length() > 1) {
                total.getAndIncrement();
            }
        });
        return total.get();
    }

    public List<Integer> removeDuplicates(List<Integer> myList) {
        return myList.stream().distinct().collect(Collectors.toList());
    }

    public Boolean checkIsEmpty(List<Integer> myList) {
        if (myList.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<Integer> checkAtLeastOneCommonMember(List<Integer> listOne, List<Integer> listTwo) {
        return listOne.stream().filter(itemOne -> listTwo.stream().anyMatch(itemTwo -> itemTwo.equals(itemOne)))
                .collect(Collectors.toList());
    }

//    public List<Integer> getDifference(List<Integer> listOne, List<Integer> listTwo){
//        return listOne.stream().filter(itemOne -> !listTwo.contains(itemOne))
//                .collect(Collectors.toList());
//    }

    public Map<Integer, Integer> accessIndexAndValue(List<Integer> myList) {
        AtomicInteger index = new AtomicInteger();
        Map<Integer, Integer> indexAndValue = new HashMap<>();
        myList.forEach(item -> indexAndValue.put(index.getAndIncrement(), item));
        return indexAndValue;
    }
}
