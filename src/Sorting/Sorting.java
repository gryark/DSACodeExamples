package Sorting;

public class Sorting {
    public static void main(String[] args) {

        Sorting ob = new Sorting();
        int arr[] = {64, 25, 12, 22, 11};

        //selection sort
        ob.selectionSort(arr);
        System.out.println("Sorted array with Selection Sort");
        ob.printArray(arr);

        //insertion sort
        ob.insertionSort(arr);
        System.out.println("Sorted array with Insertion Sort");
        ob.printArray(arr);

        //bubble sort
        ob.bubbleSort(arr);
        System.out.println("Sorted array with Bubble Sort");
        ob.printArray(arr);
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void selectionSort(int arr[]) {
        int n = arr.length; //array szie

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minimumValue = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minimumValue])
                    minimumValue = j;

            // Swap the found minimum element with the first element
            int temp = arr[minimumValue];
            arr[minimumValue] = arr[i];
            arr[i] = temp;
        }
    }

    /*Function to sort array using insertion sort*/
    void insertionSort(int arr[]) {
        int n = arr.length; //array size
        for (int i = 1; i < n; ++i) {
            int current = arr[i]; //at first index i equals to 1
            int j = i - 1;        //at first index j equals to 0

            /* Move elements of arr[0..i-1], that are
               greater than cuurent, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
