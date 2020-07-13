package lambda;

public class LambdaExceptionsDemo {


    public static void main(String[] args) throws EmptyArrayException {
        double[] numbers = {1.0,2.0,3.0,4.0};
        DoubleNumericArray average = (numbersArray) -> {

            double sum = 0;
            if(numbersArray.length==0) throw new EmptyArrayException();
            for(double x:numbersArray){
                sum += x;
            }
            return sum/numbers.length;
        };
        System.out.println(average.func(numbers));
        //Next Line Will throw an exception
        System.out.println(average.func(new double[0]));

    }
}
interface DoubleNumericArray{
    double func(double[] numbers) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Empty Array");
    }
}