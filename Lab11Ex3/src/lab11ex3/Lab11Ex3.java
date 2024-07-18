package lab11ex3;

import java.util.ArrayList;

public class Lab11Ex3 {
    public static void removeBadPairs(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        int size = list.size();

 
        for (int i = 0; i < size-1 ; i += 2) {
            if (i == size - 2 || list.get(i) <= list.get(i + 1)) {               
                result.add(list.get(i));
                result.add(list.get(i + 1));
            }
        }
        list.clear();
            
        list.addAll(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(7);
        myList.add(9);
        myList.add(1);
        myList.add(5);
        myList.add(5);
        myList.add(1);
        myList.add(5);
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(7);
        myList.add(3);
        //myList.add(1);

        System.out.println("Original list: " + myList);
        removeBadPairs(myList);
        System.out.println("After removing bad pairs: " + myList);
    }
}
