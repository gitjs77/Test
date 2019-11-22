import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CountCharacters {
    public static void main(String[] args) {
        System.out.println(countCharacters("www.jackkobec.com"));
        System.out.println(countCharacters(null));

        System.out.println(countCharacters2("www.jackkobec.com"));
        System.out.println(countCharacters2(null));
    }

    public static Map<Character, Integer> countCharacters(final String string){
        if (string == null || string.isEmpty()) {
            return null;
        }

        Map<Character, Integer> result = new HashMap<>();
        final char[] letters = string.toCharArray();
        for (Character letter: letters) {
            if (result.containsKey(letter)) {
                result.put(letter, result.get(letter) + 1);
            } else {
                result.put(letter, 1);
            }
        }

        return result;
    }

    public static Map<Character, Integer> countCharacters2(final String string){
        if (string == null || string.isEmpty()) {
            return null;
        }

        final List<Character> letters = string.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        return letters.stream().collect(
                Collectors.toMap(
                        letter -> letter,
                        letter -> 1,
                        (prevValue, currentValue) -> ++prevValue
                )
        );
    }

    private static <Integer> BinaryOperator<java.lang.Integer> lettersCountMerger() {
        return (prevValue, currentValue) -> {
            return ++prevValue;
        };
    }
}