package Recursion;

public class SumClass {

    public static void main(String[] args) {

        int [] arr = {5, 4 , 8 , 6, 10};
        //int res=sumWithoutRecursion(arr);
        int res2=sumWithRecursion(arr, 5);
        System.out.println(res2);

    }

    public static int sumWithoutRecursion(int[] data){
        int result=0;
        for (int i=0; i<data.length; i++){
            result += data[i];
        }
        return result;
    }
    int result=0;
    public static int sumWithRecursion(int[] data, int n) {

        if (n == 0)
            return 0;
        else
            return sumWithRecursion(data, n - 1) + data[n - 1];
    }
}
