package Arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        int[] arr = {7, 3, 8, 6, 5, 4, 12, 16, 20, 14};

        ArrayExample arrayClass = new ArrayExample();
        /*
        arrayClass.printFirstElementOfArray(arr);
        arrayClass.printAllElementOfArray(arr);
        arrayClass.addElementToLast(100, arr);
        arrayClass.addElementToFirst(2, arr);*/
        arrayClass.DeleteElementWithIndex(3, arr);
        /*
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(Arrays.toString(list.toArray()));
         */


    }
}
