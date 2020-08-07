package exploring.java.lang;

public class StringNumberConversion {

    public static void main(String[] args) {

        String number = "123";
        int sameNumber;
        try{
         sameNumber = Integer.parseInt(number);
         System.out.println("The number is 123: ");
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        int num = 987;
        String sameNum = Integer.toString(num);
        System.out.println("num is 987: " + sameNum);

        System.out.println(
                Integer.toBinaryString(128) + "\n" +
                        Integer.toHexString(128) + "\n" +
                        Integer.toOctalString(128)
        );


    }

}

