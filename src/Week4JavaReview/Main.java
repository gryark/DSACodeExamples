package Week4JavaReview;

public class Main {
    //Procedural like c,
    // OOP classes Java, C#
    //Class variables as a instance variable --> primitive types and reference types
    //Class methods
    //local variables
    // for loops, while loops
    // if switch cases
    // variables --> int, short, byte,    long,  double,  float,  boolean, String, char
    short age= 10;
    String name="Güray";

    //long age2= Integer.parseInt(str1) ; // narrowing or casting to long value

    boolean isOk=true;
    //case rules
    // ClassName    variable: myNum -->camelCase MyNumber --> pascal case
    // my_numbers -->> snake_case
    static int[] myNumberArray= {10, 20, 30}; //global
    int myArr[] = {30, 40 ,50}; //0:30, 1:40, 2:50


    int[] myArr3= new int[10];

    //default values
    // integer values 0
    // double values 0.0
    // boolean values false
    // String value null

    // refactor
    public static void main(String[] args) {
        boolean result = searchNumbers(15);
        if(result)
            System.out.println("We found the number");
        else
            System.out.println("We couldn't find the number");

    }

    //
    static boolean searchNumbers(int number) { //methods

        for (int i: myNumberArray  ) {

        }

        for (int i = 0; i < myNumberArray.length ; i++) {
            if(number==myNumberArray[i])
                return true;
        }
        return false;

    }
}
