import java.util.stream.Stream;

public class FizzBuzz {
    public static void main(String[] args) {

        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";
        Stream.iterate(1, n -> n + 1)
                .limit(100)
                .forEachOrdered(item -> {
                    if (item % 3 == 0 && item % 5 == 0) {
                        System.out.println(FIZZ + " " + BUZZ);
                        return;
                    } else if (item % 3 == 0) {
                        System.out.println(FIZZ);
                        return;
                    } else if (item % 5 == 0) {
                        System.out.println(BUZZ);
                        return;
                    }

                    System.out.println(item);
                });
    }
}