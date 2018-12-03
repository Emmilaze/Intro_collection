
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Utils {

    static int key[];

    public static long add (Collection list, String data[]) {
        long time = System.currentTimeMillis();
        for (String str: data)
            list.add(str);
        return System.currentTimeMillis() - time;
    }

    public static long remove(Collection list) {
        long time = System.currentTimeMillis();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        return System.currentTimeMillis() - time;
    }

    public static long getElement(Collection list) {
        Object str;
        long time = System.currentTimeMillis();
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            str = iterator.next();
        return System.currentTimeMillis() - time;
    }

    public static long add (HashMap map, String data[]) {

        key = new int[data.length];
        for (int i = 0; i < key.length; i++)
            key[i] = i;

        long time = System.currentTimeMillis();
        for (int i = 0; i < data.length; i++) {
            map.put(key[i], data[i]);
        }
        return System.currentTimeMillis() - time;
    }

    public static long remove(HashMap map) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < key.length; i++)
            map.remove(key[i]);
        return System.currentTimeMillis() - time;
    }

    public static long getElement(HashMap map) {
        String str;
        long time = System.currentTimeMillis();
        for (int i = 0; i < key.length; i++)
            str = (String)map.get(key[i]);
        return System.currentTimeMillis() - time;
    }

}
