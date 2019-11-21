import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(2);
            add(7);
            add(2);
            add(7);
            add(2);
        }};

        System.out.println(removeAll(list, 2));
        System.out.println(removeAll2(list, 2));
        System.out.println(removeAll3(list, 2));
        System.out.println(removeAll4(list, 2));
        System.out.println(removeAll5(list, 2));
    }

    public static List<Integer> removeAll(final List<Integer> list, final Integer forRemove) {

        if (list == null) {
            return null;
        }

        if (forRemove == null){
            return list;
        }

        list.removeIf(item -> forRemove.equals(item));
        return list;
    }

    public static List<Integer> removeAll2(final List<Integer> list, final Integer forRemove) {
        if (list == null) {
            return null;
        }

        if (forRemove == null){
            return list;
        }

        return list.stream().filter(item -> !forRemove.equals(item)).collect(Collectors.toList());
    }

    public static List<Integer> removeAll3(final List<Integer> list, final Integer forRemove) {
        if (list == null) {
            return null;
        }

        if (forRemove == null){
            return list;
        }

        while (list.contains(forRemove)) {
            list.remove(forRemove);
        }

        return list;
    }

    public static List<Integer> removeAll4(final List<Integer> list, final Integer forRemove) {
        if (list == null) {
            return null;
        }

        if (forRemove == null){
            return list;
        }

        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (forRemove.equals(iterator.next())) {
                iterator.remove();
            }
        }

        return list;
    }

    public static List<Integer> removeAll5(final List<Integer> list, final Integer forRemove) {
        if (list == null) {
            return null;
        }

        if (forRemove == null){
            return list;
        }

        final ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (forRemove.equals(iterator.next())) {
                iterator.remove();
            }
        }

        return list;
    }
}