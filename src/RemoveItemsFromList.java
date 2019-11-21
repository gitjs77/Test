import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveItemsFromList {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(2);
            add(7);
            add(2);
            add(null);
            add(7);
            add(2);
        }};

        System.out.println(removeMaxElement(new ArrayList<>(list)));
        System.out.println(removeMaxElement(null));

        System.out.println(removeMaxElement2(new ArrayList<>(list)));
        System.out.println(removeMaxElement2(null));

        System.out.println(removeMaxElement3(new ArrayList<>(list)));
        System.out.println(removeMaxElement3(null));

        System.out.println(removeMaxElement4(new ArrayList<>(list)));
        System.out.println(removeMaxElement4(null));
    }

    public static List<Integer> removeMaxElement(final List<Integer> list) {
        if (list == null) {
            return null;
        }

        list.removeIf(item -> list.stream().filter(Objects::nonNull).max(Integer::compareTo).get().equals(item));
        return list;
    }

    public static List<Integer> removeMaxElement2(final List<Integer> list) {
        return list == null
                ? null
                : list
                .stream().filter(item -> !list.stream().filter(Objects::nonNull).max(Integer::compareTo).get().equals(item))
                .collect(Collectors.toList());
    }

    public static List<Integer> removeMaxElement3(final List<Integer> list) {
        if (list == null) {
            return null;
        }

        Integer maxElement = null;
        for (Integer current : list) {
            if (current == null) {
                continue;
            }
            if (maxElement == null || current > maxElement) {
                maxElement = current;
            }
        }

        if (maxElement == null) {
            return list;
        }

        list.removeIf(maxElement::equals);
        return list;
    }

    public static List<Integer> removeMaxElement4(final List<Integer> list) {
        if (list == null) {
            return null;
        }

        Integer maxElement = null;
        for (int i = 0; i < list.size(); i++) {
            final Integer current = list.get(i);
            if (current == null) {
                continue;
            }
            if (maxElement == null || current > maxElement) {
                maxElement = current;
            }
        }

        if (maxElement == null) {
            return list;
        }

        list.removeIf(maxElement::equals);
        return list;
    }
}