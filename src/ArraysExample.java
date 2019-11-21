import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysExample {
    public static void main(String[] args) {
        /**
         * Массивы.
         * Коментарий для методов и для подробных объяснений.
         */

        // Однострочный коментарий

        /*
        * Многострочный коментарий
        */

        String[] testArray = {"Vasa", "Peta", "Kata", "Vika"};
        System.out.println("Length: " + testArray.length);

        System.out.println("testArray[0]: " + testArray[0]);
        System.out.println("testArray[testArray.length - 1]: "
                + testArray[testArray.length - 1]);

        if (testArray.length >= 78) {
            System.out.println("testArray[77]: " + testArray[77]);
        } else {
            System.out.println("Array length < 78");
        }

        List<Integer> testArray2 =
                Stream.iterate(1, n -> n + 1)
                        .limit(1000)
                        .collect(Collectors.toList());

        processData(testArray2);
    }

    static public void processData(List<Integer> array) {
        System.out.println(array.size());
        System.out.println(array);
    }
}
