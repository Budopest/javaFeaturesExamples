package lambda;

public class SimpleFunctionalInterface {
    public static void main(String[] args) {
        GeniricI<Integer> factorial = (num) -> {
            int result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.specialFunc(5));

        GeniricI<String> reverse = (word) -> {
            String result = "";
            for(int i=word.length()-1;i>=0;i--){
                result += word.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.specialFunc("oops"));

        String input = "\nhi this IS uppercase\n";
        // Lambda expression can be passed to method argument
        System.out.println(stringOp(
                (word)-> word.toUpperCase(),
                input
        ));
        //Method refrence can be used here to replace the lambda expression
        System.out.println(stringOp(
                String::toLowerCase,
                input
        ));


    }
    public static String stringOp(StringFunc stringFunc,String word){
        return stringFunc.func(word);
    }
}
interface NumberTester{
    boolean test(int number);
}
interface GeniricI<T>{
    //T specifies both the return type and the parameter type of func( ).
    // This means that it is compatible with any lambda expression that takes one parameter and returns a value of the same type.
    T specialFunc(T obj);
}
interface StringFunc{
    String func(String word);
        }
