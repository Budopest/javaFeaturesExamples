package generics;

import java.util.ArrayList;

public class SimpleGenericExample {
    public static void main(String[] args){
        /*
        Gen<Integer> intGeneric = new Gen<Integer>("Hello");
        won't compile as generics provide type saftey
        *
        BoundGenericExample<String> integerBoundGenericExample = new BoundGenericExample<String>();
        won't compile as string doesnt satisfy the bound condition
        */
        WildCardGenericExample<Integer> intArray = new WildCardGenericExample<>(1,3,5);
        WildCardGenericExample<Double> doubleArray = new WildCardGenericExample<Double>(3.5,2.5,3.0);
        System.out.println(intArray.isSameAverage(doubleArray));


    }

}

class Gen<T>{


    ArrayList<T> objectsList;

    public Gen(T obj){
        objectsList = new ArrayList<>();
        objectsList.add(obj);
    }
    public String getObjectType(){
        return objectsList.get(0).getClass().getName();
    }

    public T getObj(int index) {
        return objectsList.get(index);
    }

    public void addObj(T obj) {
        objectsList.add(obj);
    }

}
