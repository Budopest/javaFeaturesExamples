package string_handling;

/*
* The String, StringBuffer, and StringBuilder classes are defined in java.lang. Thus, they are available to all programs automatically.
* All are declared final, which means that none of these classes may be subclassed.
* All three implement the CharSequence interface.
* String are unchangeable means that the contents of the String instance cannot be changed after it has been created.
 * However, a variable declared as a String reference can be changed to point at some other String object at any time.
* */
public class StringHandler {

    public static void main(String[] args){


        /*String Constructors*/
        String empty = new String();
        char[] chars = {'a','b','c'};
        String initializeByCharArray = new String(chars);
        String initializeByPartOfCharArray = new String(chars,1,1);
        String initializeByStringObject = new String(initializeByCharArray);
        byte[] ascii = {65,66,67,68,69,70};
        String initializeByByteArray = new String(ascii);
        String initializeByPartOfByteArray = new String(ascii,2,3);
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuilder stringBuilder = new StringBuilder("world");
        String initializeByStringBuffer = new String(stringBuffer);
        String initializeByStringBuilder = new String(stringBuilder);
        System.out.println(empty + "\n" +
                initializeByCharArray + "\n" +
                initializeByPartOfCharArray + "\n" +
                initializeByStringObject + "\n" +
                initializeByByteArray + "\n" +
                initializeByPartOfByteArray + "\n" +
                initializeByStringBuffer + "\n" +
                initializeByStringBuilder + "\n"
        );
        // Get lenth using int length() method
        System.out.println(initializeByByteArray.length());
        // String literal can be used for initialization
        String initializedFromLiteral = "abc";
        /*
        * Concatenation
        * */
        // + operator is used with Strings for concatenation
        String twoConcatenatedWords = "abc" + "def";
        String twentyTwo = "number = "+2+2;
        String four = "number = " + (2+2);
        System.out.println(initializedFromLiteral + "\n"
                + twoConcatenatedWords + "\n" +
                twentyTwo + "\n" +
                four
        );
        /*
        * String have overridden versions of valueOf()
        * for primitive types in convert the value to String
        * for objects it calls the toString() method which is defined by Object class
        * */
        System.out.println(String.valueOf(5111995));

        String sentence = "play with this String";
        /*
        * chars Extraction
        * */
        System.out.println(sentence.charAt(1));
        int sourceStartIndex = 5;
        int sourceEndIndex = 9;
        char subChars[] = new char[sourceEndIndex-sourceStartIndex];
        sentence.getChars(sourceStartIndex,sourceEndIndex,subChars,0);
        System.out.println(subChars);
        // There is other methods like getBytes, toCharArray, ....

        /*
        * String comparison
        * */

        String word = "hello";
        String wordUpperCase = "Hello";
        String sameWord = "hello";
        String anotherWord = "world";
        System.out.println(
                word.equals(sameWord) + "\n" +
                word.equals(wordUpperCase) + "\n" +
                word.equals(anotherWord) + "\n" +
                word.equalsIgnoreCase(wordUpperCase) + "\n" +
                        // regionMatches() control start index of both strings & number of chars to compare & case
                        word.regionMatches(true,0,wordUpperCase,0,2) + "\n" +
                        word.regionMatches(false,0,wordUpperCase,0,2) + "\n" +
                        word.startsWith("he") + "\n" + word.endsWith("LO") + "\n" + word.startsWith("ll",2) + "\n"
                        );
        // == compares object refrences not the string chars
        System.out.println(
                        word.compareTo(anotherWord) + "\n" + word.compareTo(sameWord) + "\n" + word.compareTo(wordUpperCase) +"\n"
        );
        /*
        * Search strings
        * */
        System.out.println(word.indexOf("l") + "\n" + word.lastIndexOf("l") +
                "\n" + word.lastIndexOf("ll") +
                "\n" + word.indexOf("h",2)
        );
        /*
        * Modify strings
        * */
        System.out.println(word.substring(2) + "\n" + word.substring(2,4));
        System.out.println(word.concat(anotherWord));
        System.out.println(word.replace("l","w"));
        System.out.println("    hello    ".trim());
        System.out.println(word.toUpperCase() + "\n" + wordUpperCase.toLowerCase());
        String joinedString = String.join(",","Alpha","Beta","Gama");
        System.out.println(joinedString);

    }

}
