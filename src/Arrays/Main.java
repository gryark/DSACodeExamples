package Arrays;

import java.util.*;

public class Main {

    public static int findsWhat(int[] data) {
        int n = data.length;
        int currentM = data[0];
        for (int j = 1; j < n; j++)
            if (data[j] > currentM)
                currentM = data[j];
        return currentM;
    }
    public static int arrayMax(int[] data) {
        int n = data.length;
        int currentMax = data[0];
        for (int j = 1; j < n; j++)
            if (data[j] > currentMax)
                currentMax = data[j];
        return currentMax;
    }

    public static void main(String[] args) {


        int[] arr = {7, 3, 8, 6, 5, 4, 12, 16, 20, 14};
        System.out.println(arrayMax(arr));

/*
        int arr[]= new int[10];
        arr[0]=7;
        arr[10]=50;
*/
        //First Homework
        //Adding new student and List Students

        //Second HomeWork
        //Find the Element And Delete it.

        // ArrayExample arrayClass = new ArrayExample();

        //arrayClass.printElementOfArray(arr, 0);
        //arrayClass.printAllElementOfArray(arr);
        //arrayClass.addElementToLast(100, arr);
        //arrayClass.addElementToFirst(2, arr);
        //arrayClass.DeleteElementWithIndex(3, arr);
        // arrayClass.DeleteElementWithIndex2(2, arr);
        //ADT List
//        List<Integer> list= new ArrayList<Integer>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(0);
//        System.out.println(Arrays.toString(list.toArray()));


    }
}
