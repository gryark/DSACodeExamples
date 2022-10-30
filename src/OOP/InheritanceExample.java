package OOP;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
//Multilevel Inheritance
/*class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}

}*/
//Hierarchical Inheritance
/*class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}*/

public class InheritanceExample {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
