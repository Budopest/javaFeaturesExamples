package generics;

//only numbers and its sub classes can be used
public class BoundGenericExample<T extends Number> {

    T[] numbers;

    @SafeVarargs
    BoundGenericExample(T... numbers){
        this.numbers = numbers;
    }
    double getAverageinDouble(){
        if(numbers.length==0) return 0;
        double sum = 0;
        for(T num:this.numbers){
            sum += num.doubleValue();
        }
        return sum/(this.numbers.length);
    }
    void printAverage(){
        System.out.println(getAverageinDouble());
    }


}
