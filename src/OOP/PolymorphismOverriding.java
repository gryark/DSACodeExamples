package OOP;
// Java Program for Method Overriding

// Class 1 - Super class
class ParentClass {
    public void printScreen() {
        System.out.println("I'm parent class");
    }
}
// Class 2
class Child1 extends ParentClass { //Overrides printScreen()
    public void printScreen() {
        System.out.println("I'm child1 class");
    }
}
// Class 3
class Child2 extends ParentClass { //Overrides printScreen()
    public void printScreen() {
        System.out.println("I'm child2 class");
    }
}
public class PolymorphismOverriding {
    public static void main(String[] args) {
        ParentClass a;
        a=new Child1();
        a.printScreen();

        a=new Child2();
        a.printScreen();

    }
}
