package JavaExamples;

public class ForLoops {
    public static void main(String[] args) {

        int[] numArray = new int[100000000];
        for (int i = 0; i < numArray.length; i++)
            numArray[i] = i; // 0,1,2...

        for(int i=0; i < numArray.length; i++){
            System.out.println(i);
        }
    }
}
