package exploring.java.lang;

public class InfNan {
    public static void main(String[] args){

        Double inf = Double.valueOf(1/0.);
        Double nan = Double.valueOf(0/0.);

        System.out.println(
                "is inf INFINITE: " + inf.isInfinite() + "\n" +
                        "is nan NonNumericValue: " + nan.isNaN()
        );

    }
}
