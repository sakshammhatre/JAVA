
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.HashSet;

class CollectionFramework {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(20);

        System.out.println("ArrayList: " + arrayList);


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Mumbai");
        linkedList.add("Pune");
        linkedList.add("Nashik");

        System.out.println("LinkedList: " + linkedList);


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println("Vector: " + vector);


        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java");

        System.out.println("HashSet: " + hashSet);
    }
}
