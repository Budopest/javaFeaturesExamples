package generics;

import java.util.ArrayList;

public class SimpleGenericExample {
    public static void main(String[] args){

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
