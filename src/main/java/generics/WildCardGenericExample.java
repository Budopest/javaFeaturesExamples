package generics;

public class WildCardGenericExample<T extends Number> extends BoundGenericExample<T> {

    public WildCardGenericExample(T... numbers) {
        super(numbers);
    }

    Boolean isSameAverage(WildCardGenericExample<?> objectToCompare){
        /*
         *cant use <T> as the parameter passed must be the same as this object
         * so wild card is used to allow the function to accept any type of generic
         * Both are bounded by Number from the parent class
         */
        return this.getAverageinDouble()==objectToCompare.getAverageinDouble();
    }

}
