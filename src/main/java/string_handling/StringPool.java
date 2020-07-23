package string_handling;

public class StringPool {
    public static void main(String[] args){

        String name = "Abdelrahman";
        String secondName = "Abdelrahman";
        String thirdName = new String("Abdelrahman");

        if(name==secondName) System.out.println("Both point to the same string in the string pool");
        if(name!=thirdName) System.out.println("name is in the String pool while thirdName is in the heap as it was initialized using the new keyword");


    }
}
