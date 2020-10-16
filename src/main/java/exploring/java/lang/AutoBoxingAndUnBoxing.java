package exploring.java.lang;

public class AutoBoxingAndUnBoxing {

    public static void main(String[] args) {

        int num = 10;
        //Auto Boxing
        Integer number = num;
        //Manually Wrappinng
        number = Integer.valueOf(num);
        //Both prev statments are the same as Auto Boxing happens in the first statement No need for Value of
        // Auto unboxing
        num = number;
        // Manually unwrapping
        num = number.intValue();


    }
}
class book{
    book(){
        System.out.println("this is a book");
    }
    String getName(int index){
            return "book";
        }
    String getName(){
        return "No index";
    }
    /*
    Cannot over LOad with changing return type only
    int getName(){

        return 0;
    }
    */
    /*
    * return type can be changed or kept but arguments must change
    * */
    int getName(double index){
        return 0;
    }
}
class AudioBook extends book{
    AudioBook(){
        System.out.println("this is an Audio book");

    }
    String getName(){
        return "Audio book";
    }
    /*
    return type should be the same or covariant
    return type should be subtype of the original
    or can converted to a unchecked conversion(After erasuer)
        @Override
    int getName(int index){
        return 0;
    }
     */

    /*
    * access modifier cannot be more restrict when overriding a method
    * also private, static, final methods cannot be overridden they are local to thier class
    private String getName(int index){
        return "Audio book";
    }
    * */


}
