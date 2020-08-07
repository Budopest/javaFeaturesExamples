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
