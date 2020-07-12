package generics;

public class GeniricMethodExample {

    <T extends Comparable<T>,V extends T>Boolean isInArray(T element,V[] array){
        for(T e:array){
            if(e.equals(element)) return true;
        }
        return false;
    }
}
