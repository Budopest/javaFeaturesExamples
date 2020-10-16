package the.collection.framework;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String args[]) {

        /*
        * public class LinkedList<E>
          extends AbstractSequentialList<E>
          implements List<E>, Deque<E>, Cloneable, java.io.Serializable
        * */
        LinkedList<String> names = new LinkedList<>();
        names.add("Rana");
        names.addFirst("Radwa");
        names.addLast("Ahmed");
        names.offerFirst("Fatma");
        names.offerLast("Abdelrahman");
        //Methods from the queue interface
        names.offer("Mohamed");
        System.out.println(names);
        System.out.println("peek in the queuq: " +  names.peek());
        System.out.println("poll from the queue: " + names.poll());
        System.out.println("Remove from the queue: " + names.remove());
        //Methods from the list interface
        System.out.println("get from the list: "+names.get(0));
        names.remove(0);
        //Methods from the dequeue
        System.out.println("peek in the dequeue: " + names.peekFirst() + " " + names.peekLast());
        System.out.println("pool in the dequeue: " + names.pollFirst() + " " + names.pollLast());
        System.out.println(names);
        names.add("SARA");
        names.add("Adam");
        names.add("samir");
        System.out.println(names);
        names.push("Qassem");
        System.out.println(names);
        System.out.println("pop from the dequeue: " + names.pop());
        System.out.println(names);
        System.out.println("remove from dequeue: " + names.removeFirst() +" "+ names.removeLast());
        System.out.println(names);





    }

}
