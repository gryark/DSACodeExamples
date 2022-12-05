package Recursion;

import java.io.File;

public class RecursionExamples {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        int[] arrSorted={2,5,7,10,12,15,25};
        System.out.println(binarySearch(arrSorted,7, 0, arrSorted.length));

        File folder=new File("C:\\Users\\gry\\OneDrive\\2022+\\DataStructuresAndAlgorithms\\1. Gry Lecture Notes");
        System.out.println(diskUsage(folder));

        int[] arrSum={10, 20, 30};
        System.out.println(linearSum(arrSum,arrSum.length));


    }

    /**
     * FACTORIAL EXAMPLE
     * @param n
     * @return int
     * @throws IllegalArgumentException
     */
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException(); // argument must be nonnegative
        else if (n == 0)
            return 1; // base case
        else
            return n * factorial(n - 1); // recursive case
    }

    /**
     * Returns true if the target value is found in the indicated portion of the data array.
     * This search only considers the array portion from data[low] to data[high] inclusive.
     */
    public static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low > high)
            return false; // interval empty; no match
        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return true; // found a match
            else if (target < data[mid])
                return binarySearch(data, target, low, mid - 1); // recur left of the middle
            else
                return binarySearch(data, target, mid + 1, high); // recur right of the middle
        }
    }

    /**
     * Calculates the total disk usage (in bytes) of the portion of the file system rooted
     * at the given path, while printing a summary akin to the standard 'du' Unix tool.
     */
    public static long diskUsage(File root) {
        long total = root.length(); // start with direct disk usage
        if (root.isDirectory()) { // and if this is a directory,
            for (String childname : root.list()) { // then for each child
                File child = new File(root, childname); // compose full path to child
                total += diskUsage(child); // add child’s usage to total
            }
        }
        System.out.println(total + "\t" + root); // descriptive output
        return total; // return the grand total
    }

    public static int linearSum(int[] data, int n) {
        if (n == 0)
            return 0;
        else
            return linearSum(data, n - 1) + data[n - 1];
    }

}
