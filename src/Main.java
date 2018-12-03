
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String data[] = Data.generator(100000);

        Collection<String> list;
        System.out.println("\t\t\t\tAdd Remove Get element");

        //ArrayList
        list = new ArrayList<>();
        long t1 = Utils.add(list, data);
        long t2 = Utils.remove(list);
        long t3 = Utils.getElement(list);
        System.out.println("Array list\t\t" + t1 + "\t " + t2 + "\t" + t3);

        //LinkedList
        list = new LinkedList<>();
        t1 = Utils.add(list, data);
        t2 = Utils.remove(list);
        t3 = Utils.getElement(list);
        System.out.println("Linked list\t\t" + t1 + "\t " + t2 + "\t\t" + t3);

        //HashSet
        list = new HashSet();
        t1 = Utils.add(list, data);
        t2 = Utils.remove(list);
        t3 = Utils.getElement(list);
        System.out.println("HashSet list\t" + t1 + "\t " + t2 + "\t\t" + t3);

        //TreeSet
        list = new TreeSet<>();
        t1 = Utils.add(list, data);
        t2 = Utils.remove(list);
        t3 = Utils.getElement(list);
        System.out.println("TreeSet list\t" + t1 + "\t " + t2 + "\t\t" + t3);

        //HashMap
        HashMap<Integer, String> map = new HashMap<>();
        t1 = Utils.add(map, data);
        t2 = Utils.remove(map);
        t3 = Utils.getElement(map);
        System.out.println("HashMap list\t" + t1 + "\t " + t2 + "\t\t" + t3);

        //TreeMap
        TreeMap<Integer, String> tree = new TreeMap<>();
        t1 = Utils.add(map, data);
        t2 = Utils.remove(map);
        t3 = Utils.getElement(map);
        System.out.println("TreeMap list\t" + t1 + "\t " + t2 + "\t\t" + t3);
    }
}
