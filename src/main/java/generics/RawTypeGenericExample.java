package generics;

public class RawTypeGenericExample {
    public static void main(String[] args){
        /*
        *Java allows a generic class to be used without any type arguments.
        *This creates a raw type for the class.
        *This raw type is compatible with legacy code, which has no knowledge of generics.
        * The main drawback to using the raw type is that the type safety of generics is lost.
        */
        Gen<Integer> integerGen = new Gen<Integer>(5);
        Gen<String> stringGen = new Gen<String>("Hello");
        Gen<Double> doubleGen = new Gen<Double>(7.0);
        // Using  Gen class without specifying the type argument
        // The compiler generates unchecked warnings
        Gen rawGen = new Gen(5.6);
        // A Cast is necessary as the return type is unknown
        double num = (double)rawGen.getObj(0);
        System.out.println(num);
        /*
        This will compile but will also cause run time error
        int intNum = (Integer)rawGen.getObj(0);
        */
        stringGen = rawGen; // this assignement override type saftey, its legal but may be wrong;
        /*
        *This will compile but will also cause run time error
        *String word = stringGen.getObj(0);
        */
        /*
        stringGen = integerGen; //wont compile
        rawGen = integerGen or ntegerGen = rawGen //is corrrect but can lead to run time error
        */
        //Because both raw and double has double values this will work
        rawGen = doubleGen;
        System.out.println(rawGen.getObj(0));

    }
}


