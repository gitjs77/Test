package methodReferenceMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @Author Jack <e.kobets>
 */
public class MethodReferenceMap {

    public static final String METHOD = "method";

    public static void main(String[] args) {

        System.out.println(new MethodReferenceMap().test().get(METHOD).apply("Text"));
    }

    public Map<String, Function<String, String>> test() {
        Map<String, Function<String, String>> referenceMap = new HashMap<>();
        referenceMap.put(METHOD, this::method);

        return referenceMap;
    }

    public String method(final String input) {
        return input;
    }
}
