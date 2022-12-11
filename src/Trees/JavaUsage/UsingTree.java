package Trees.JavaUsage;

import java.util.Random;
import java.util.TreeSet;

public class UsingTree {
    static int size = 100000;

    public static void main(String[] args) {
        /* tree performance */
        long startTimeToCreateTree = System.currentTimeMillis();
        TreeSet<Integer> treeSet = new TreeSet<>();
        setRandomSet(treeSet);
        System.out.println( " -> Time passed for setItem for tree : " +
                (System.currentTimeMillis() - startTimeToCreateTree) + " milisecond");

        long startTimeToFindFromTree = System.currentTimeMillis();
        boolean isNumberFoundInTree = getItemFromTree(treeSet, 20);
        System.out.println("Number found in TreeSet? " + isNumberFoundInTree + " -> Time passed for getItem from tree() : " +
                (System.currentTimeMillis() - startTimeToFindFromTree) + " milisecond");

        /*---------------------------------*/
        /* array performance */
        int[] numArray = new int[size];
        long startTimeToCreateArray = System.currentTimeMillis();
        setRandomArray(numArray);
        System.out.println( " -> Time passed for setItem for tree : " +
                (System.currentTimeMillis() - startTimeToCreateArray) + " milisecond");
        long startToFindFromArray = System.currentTimeMillis();
        boolean isNumberFoundInArray = getItemFormArray(numArray, 20);
        System.out.println("Number found in Array? " + isNumberFoundInArray + " -> Time passed for getItem() from Array : " +
                (System.currentTimeMillis() - startToFindFromArray) + " milisecond");
    }

    private static boolean getItemFormArray(int[] numArray, int item) {
        //search all items one by one.
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == item)
                return true;
        }
        return false;
    }

    private static void setRandomArray(int[] numArray) {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            numArray[i] = random.nextInt(size);
    }

    private static boolean getItemFromTree(TreeSet<Integer> treeSet, int number) {
        return treeSet.contains(number);
    }

    private static void setRandomSet(TreeSet<Integer> treeSet) {

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            treeSet.add(random.nextInt(size));
        }

    }
}
