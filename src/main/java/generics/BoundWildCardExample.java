package generics;

public class BoundWildCardExample {

    static void showXY(Coords<?> coords) {
        System.out.println("X | Y\n");
        for (int i = 0; i < coords.coordsArray.length; i++) {
            System.out.println(coords.coordsArray[i].getX() + " | " + coords.coordsArray[i].getY() + "\n");
        }
    }

    static void showXYZ(Coords<? extends ThreeDimensionsCoordinates> coords) {
        System.out.println("X | Y | Z\n");
        for (int i = 0; i < coords.coordsArray.length; i++) {
            System.out.println(coords.coordsArray[i].getX() +
                    " | " + coords.coordsArray[i].getY() +
                    " | " + coords.coordsArray[i].getZ() + "\n"
            );
        }
    }

    static void showXYZT(Coords<? extends FourDimensionsCoordinates> coords) {
        System.out.println("X | Y | Z\n");
        for (int i = 0; i < coords.coordsArray.length; i++) {
            System.out.println(coords.coordsArray[i].getX() +
                    " | " + coords.coordsArray[i].getY() +
                    " | " + coords.coordsArray[i].getZ() +
                    " | " + coords.coordsArray[i].getT() + "\n"
            );
        }
    }

    public static void main(String[] args) {

        TwoDimensionsCoordinates[] TwoD = new TwoDimensionsCoordinates[] {
                new TwoDimensionsCoordinates(1.0, 2.0),
                new ThreeDimensionsCoordinates(2,5,6),
                new FourDimensionsCoordinates(2,3,8,9)
        };
        ThreeDimensionsCoordinates[] ThreeD = new ThreeDimensionsCoordinates[] {
                new ThreeDimensionsCoordinates(1.0, 2.0,14.0),
                new ThreeDimensionsCoordinates(2,5,6),
                new FourDimensionsCoordinates(2,3,8,9)
        };
        showXY(new Coords<>(TwoD));
        /*
        *showXYZ(new Coords<ThreeDimensionsCoordinates>(TwoD));
        * will not compile as TwoD has elements of twoDimensions only
        */
        showXYZ(new Coords<>(ThreeD));

    }
}

    class Coords<T extends TwoDimensionsCoordinates>{
        T[] coordsArray;
        Coords(T[] coordsArray){
            this.coordsArray = coordsArray;
        }

    }

    class TwoDimensionsCoordinates{
        private double x,y;
        TwoDimensionsCoordinates(double x,double y){
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
    class ThreeDimensionsCoordinates extends TwoDimensionsCoordinates{
        private double z;
        ThreeDimensionsCoordinates(double x, double y,double z) {
            super(x, y);
            this.z = z;
        }

        public double getZ() {
            return z;
        }
    }
    class FourDimensionsCoordinates extends ThreeDimensionsCoordinates{

        private double t;
        FourDimensionsCoordinates(double x, double y, double z, double t) {
            super(x, y, z);
            this.t = t;
        }

        public double getT() {
            return t;
        }
    }

