import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {

    }

    public static String reverse(final String st) {
        if (st == null) {
            return null;
        }

        if (st.isEmpty()) {
            return st;
        }

        String[] lettersArray = st.split("");
        StringBuilder result = new StringBuilder();
        for (int i = lettersArray.length - 1; i >= 0; i--) {
            result.append(lettersArray[i]);
        }

        return result.toString();
    }

    public static String reverse2(final String st) {
        if (st == null) {
            return null;
        }

        if (st.isEmpty()) {
            return st;
        }

        StringBuilder result = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            result.append(st.charAt(i));
        }

        return result.toString();
    }

    public static String reverse3(final String st) {
        return (st == null || st.isEmpty())
                ? st
                : Stream.of(st.split("")).sorted((st1, st2) -> -1).collect(Collectors.joining());
    }
}