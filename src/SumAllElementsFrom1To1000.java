import java.util.stream.Stream;

public class SumAllElementsFrom1To1000 {
    public static void main(String[] args) {

        /**
         * Sum of all elements from 1 to 1000
         */
        final int sum = Stream.iterate(1, n -> n + 1).limit(1000).mapToInt(el -> el).sum();
        System.out.println(sum);
    }
}
