package string_handling;

public class StringBuffersHandler {
    public static void main(String[] args){
        /*
        * String Buffer Constructors
        * StringBuffer( )  : reserve room for 16 chars
        * StringBuffer(int size) : use size to reserve the required memory
        * StringBuffer(String str) : initialize with the str and reserve 16 more chars
        * StringBuffer(CharSequence chars)
        * StringBuffer allocates room for 16 additional characters when no specific buffer length is requested,
        * because reallocation is a costly process in terms of time. Also, frequent reallocations can fragment memory
        * If you want to preallocate room for a certain number of characters after a StringBuffer has been constructed,
        * you can use ensureCapacity( ) to set the size of the buffer.
        * A buffer larger than minCapacity may be allocated for reasons of efficiency.
        * To set the length of the string within a StringBuffer object, use setLength( )
        * When you increase the size of the string, null characters are added to the end.
        * If you call setLength( ) with a value less than the current value returned by length( ),
        * then the characters stored beyond the new length will be lost.
        * */
        StringBuffer stringBuffer = new StringBuffer("hello world");
        System.out.println(
                        stringBuffer.length() + "\n" +
                        stringBuffer.capacity()

        );
        System.out.println(stringBuffer.charAt(2));
        stringBuffer.setCharAt(5,'_');
        System.out.println(stringBuffer);
        stringBuffer.append(" of java");
        String convertToString = stringBuffer.toString();
        System.out.println(convertToString);
        stringBuffer.insert(6,"Amazing ");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        stringBuffer.delete(22,27);
        stringBuffer.deleteCharAt(21);
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        stringBuffer.replace(17,21,"c/c++");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.substring(0,13));
        /*
        * StringBuilder is similar to StringBuffer except for one important difference: it is not synchronized,
         * which means that it is not thread-safe.
          * The advantage of StringBuilder is faster performance.
          * However, in cases in which a mutable string will be accessed by multiple threads,
          * and no external synchronization is employed, you must use StringBuffer rather than StringBuilder.
        *
        *
        * */




    }
}
