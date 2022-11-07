package OOP;
// abctract class , concrete class
public class TestAnimall {

    public static void main(String[] args) {
        IAnimall animal= new Bird();
        animal.eat();

        animal= new Cat();
        animal.eat();


    }
}
