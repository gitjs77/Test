package methodreferenceMapWithWarargs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jack <e.kobets>
 */
public class MethodReferenceMapWithWarargs {
    public static final String METHOD = "method";
    public static final String METHOD2 = "method2";

    public static void main(String[] args) {
        new MethodReferenceMapWithWarargs().callMapMethodByKey(METHOD2, "fg");
    }

    public Object callMapMethodByKey(final String key, final Object... args){
        return this.getMap().get(key).apply(args);
    }

    public Map<String, MyFunction<?>> getMap() {
        Map<String, MyFunction<?>> referenceMap = new HashMap<>();
        referenceMap.put(METHOD, this::method);
        referenceMap.put(METHOD2, this::method2);

        return referenceMap;
    }

    public Object method(final Object input) {
        return input;
    }

    public Object method2(final Object... input) {
        return Arrays.stream(input).reduce((el, el2) -> (int)el + (int)el2).orElse(-1);
    }
}
@FunctionalInterface
interface MyFunction<R> {
    R apply(Object... args);
}

