package Arrays;

import java.sql.SQLOutput;

public class ArrayExample {


    public void printElementOfArray(int arr[], int index) {
        System.out.println("First element of array = " + arr[index]);
    }

    /*print all array elements with for loop */
    public void printAllElementOfArray(int arr[]) {
        System.out.print("Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    //Array Add Methods
    public void addElementToLast(int newNumber, int arr[]) {
        System.out.println("**Initial Array **");
        printAllElementOfArray(arr);
        //arr[arr.length]=newNumber;

        int newArr[] = new int[arr.length + 1];
        /*int i=0;
        while(i <newArr.length-1)
        {
            newArr[i]=arr[i];
            i++;
        }*/
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = newNumber;
        System.out.println("**New Array**");
        printAllElementOfArray(newArr);
    }

    public void addElementToFirst(int newNumber, int arr[]) {
        System.out.println("**Initial Array **");
        printAllElementOfArray(arr);
        //arr[arr.length]=newNumber;

        int newArr[] = new int[arr.length + 1];
        newArr[0] = newNumber;
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("**New Array**");
        printAllElementOfArray(newArr);
    }

    //Array Delete An Item At Index
    public void DeleteElementWithIndex(int index, int arr[]) {
        System.out.println("**Initial Array **");
        printAllElementOfArray(arr);
        //int[] arr = {7, 3, 8, 6, 5, 4, 12, 16, 20, 14};
        //int[] arr = {7, 3, 8, 5, 4, 12, 16, 20, 14, 14};
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        System.out.println("**New Array**");
        printAllElementOfArray(arr);

    }

    public void DeleteElementWithIndex2(int index, int arr[]) {
        System.out.println("**Initial Array **");
        printAllElementOfArray(arr);
        //int[] arr = {7, 3, 8, 6, 5, 4, 12, 16, 20, 14};
        //int[] arr = {7, 3, 8, 5, 4, 12, 16, 20, 14, 14};
        int newArr[] = new int[arr.length - 1];
        int j=0;
        for (int i = 0; i < newArr.length - 1; i++) {
            if (j != index)
                newArr[i] = arr[j++];
        }


        System.out.println("**New Array**");
        printAllElementOfArray(arr);

    }

}
