package AlgorithmAnalysis;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BigOExamples {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numArray = new int[100];
        for (int i = 0; i < numArray.length; i++)
            numArray[i] = i; // 0,1,2...
        /**O(1) Example*/
        long start = System.currentTimeMillis();
        getFirstItem(numArray);
        System.out.println("Time passed for getFirstItem() : " + (System.currentTimeMillis() - start) + " milisecond");

        /**O(logN) Example*/
        long start2 = System.currentTimeMillis();
        int resultIndex = binarySearch(numArray, (numArray.length - 100));
        if (resultIndex > -1)
            System.out.println("We found number " + numArray[resultIndex] + " at index : " + resultIndex);
        else
            System.out.println("We couldn't find number " + (numArray.length - 100));

        System.out.println("Time passed for binarySearch() : " + (System.currentTimeMillis() - start2) + " milisecond");
        System.out.println("Repeat Count O(logN)=" + repeatCount);

        /**O(N) Example*/
        long start3 = System.currentTimeMillis();
        int resultIndex2 = searchArray(numArray, (numArray.length - 100));
        if (resultIndex2 > -1)
            System.out.println("We found number " + numArray[resultIndex2] + " at index : " + resultIndex2);
        else
            System.out.println("We couldn't find number " + (numArray.length - 100));

        System.out.println("Time passed for searcArray() : " + (System.currentTimeMillis() - start3) + " milisecond");
    /**O(n*n) example */
    int nums[]={10,5,2,27,6};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    // O(1) running time is independent of the input size
    public static int getFirstItem(int[] pNumberArray) {
        return pNumberArray[0];
    }

    // O(logN) algorithm 	// the array is sorted
    // divide n times to end up with 1
    static int repeatCount;
    public static int binarySearch(int[] pNumberArray, int pItem) {
        int left = 0;
        int right = pNumberArray.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            repeatCount++;
            // we found the item in the middle
            if (pNumberArray[middle] == pItem)
                return middle;
            // look right side
            if (pNumberArray[middle] < pItem) {
                left = middle + 1;
            } else {// look left side
                right = middle - 1;
            }
        }
        return -1; // item is not found
    }

    /** O(n) running time */
    public static int searchArray(int[] pNumberArray, int pItem) {
        //search all items one by one.
        for (int i = 0; i < pNumberArray.length; i++) {
            if(pNumberArray[i] == pItem)
                return i;
        }
        return -1;
    }

    /**
     * O(n*n) example Bubble sort
     */
    //[10, 5, 2, 27, 6] -> 5, 2, 10, 6, 27
    public static void bubbleSort(int[] pNumberArray) {
        for (int i = 0; i <pNumberArray.length ; i++) {
            for (int j = 1; j < pNumberArray.length-i; j++) {
                if(pNumberArray[j-1] > pNumberArray[j]){
                    int temp=pNumberArray[j-1];
                    pNumberArray[j-1]=pNumberArray[j];
                    pNumberArray[j]=temp;
                }
            }
        }

    }
}