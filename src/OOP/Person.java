package OOP;



class Student extends Person{

    String schoolName;
    //this --> Student
    //super ->> Person
    public Student(int id, String name, float height) {
        super(id, name, height);
    }

    public Student(String name, float height) {
        super(name, height);
    }

    public void study(){
        System.out.println("I am studying");
    }

}

class Person  {
    /*
    1. Encapsulation --> Hiding variables -> accessor modifiers --> public, private and protected
    2. Inheritance --> parent and child defination --> extend
    3. Abstraction --> Interfaces --> abstract classes
    4. Polymorphism
    */

    private int Id; //instance variables KNOWS
    private String name;
    private float height;

    // Polymorphism overloading
    public Person(int id, String name, float height){

    }
    public Person(String name, float height){

    }
   public int getId(){
        return Id;
    }
    public void setId(int pId){
        this.Id=pId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
       if(height > 1.0)
           this.height=height;
    }

// ternary operation
    ///Polymprhmisp
    public void talk(){ // DOES
        System.out.println("Hello I am " + name + " and my height is " +
                (height > 1.0 ? height : "not defined"));

    }
//overloaded method
    public String talk(String smthg){ // DOES
        return "Hello from talk method with paramater I overload another talk method I am "
                + name + " and my height is " ;

    }

}
