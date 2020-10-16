package generics;

public class GeniricMethodExample {

    /*
    * The type parameters are declared before the return type of the method.
    * Also note that T extends Comparable<T>.
    * Comparable is an interface declared in java.lang.
    * A class that implements Comparable defines objects that can be ordered.
    * Thus, requiring an upper bound of Comparable ensures that isIn( ) can be used only with objects that are capable of being compared.
    * Comparable is generic, and its type parameter specifies the type of objects that it compares.
    *
    * generic method syntax
    * <type-param-list > ret-type meth-name (param-list) { // …
    *
    * It is possible for constructors to be generic, even if their class is not
    *
    * */
    static <T extends Comparable<T>,V extends T>Boolean isInArray(T element,V[] array){
        for(T e:array){
            if(e.equals(element)) return true;
        }
        return false;
    }
}
