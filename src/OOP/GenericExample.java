package OOP;
    // We use < > to specify Parameter type
    class Test<T> {
        // An object of type T is declared
        T obj;
        Test(T obj) { this.obj = obj; } // constructor
        public T getObject() { return this.obj; }
    }
    //  class to test above
    public class GenericExample {
        public static void main(String[] args)
        {
            // instance of Integer type
            Test<Integer> iObj = new Test<>(15);
            System.out.println(iObj.getObject());

            // instance of String type
            Test<String> sObj
                    = new Test<String>("Aylin");
            System.out.println(sObj.getObject());
            // Calling generic method with Integer argument
            genericDisplay(11);
            // Calling generic method with String argument
            genericDisplay("Aylin");
            // Calling generic method with double argument
            genericDisplay(1.0);
        }
        // A Generic method example
        static <T> void genericDisplay(T element)
        {
            System.out.println(element.getClass().getName()
                    + " = " + element);
        }
    }

