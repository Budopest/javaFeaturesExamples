package lambda;

public class lambdaVSannonclass {

    public static void main(String args[]){

        IntOperation intOperation = (num)-> num instanceof Integer;
        System.out.println(intOperation.testINT(10));
        System.out.println(intOperation.testINT(2.3));

        IntOperation intOperation1 = new IntOperation() {
            @Override
            public boolean testINT(Number num) {
                return num instanceof Integer;
            }
        };
        System.out.println(intOperation1.testINT(6.6));

        NumberOperation numberOperation = new NumberOperation() {
            @Override
            public boolean testINT(Number num) {
                return num instanceof Integer;
            }

            @Override
            public boolean testDouble(Number num) {
                return num instanceof Double;
            }
        };
        System.out.println(numberOperation.testDouble(6));
        System.out.println(numberOperation.testDouble(6.500));
        System.out.println(numberOperation.testINT(6));



    }


}

 interface NumberOperation{
        boolean testINT(Number num);
        boolean testDouble(Number num);
}
interface  IntOperation{
    boolean testINT(Number num);
}
