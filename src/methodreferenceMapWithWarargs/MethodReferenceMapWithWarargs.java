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
    public static final String METHOD3 = "method3";

    public static void main(String[] args) {
        final Object result2 = new MethodReferenceMapWithWarargs().callMapMethodByKey(METHOD2, 1, 2);
        System.out.println(result2);

        final Object result3 = new MethodReferenceMapWithWarargs().callMapMethodByKey(METHOD3, 1, 2, null);
        System.out.println(result3);
    }

    public Object callMapMethodByKey(final String key, final Object... args) {
        return this.getMap().get(key).executeMethod(args);
    }

    public Map<String, MyFunction<?>> getMap() {
        Map<String, MyFunction<?>> referenceMap = new HashMap<>();
        referenceMap.put(METHOD, this::method);
        referenceMap.put(METHOD2, this::method2);
        referenceMap.put(METHOD3, this::method3);

        return referenceMap;
    }

    public Object method(final Object input) {
        return input;
    }

    public Object method2(final Object... input) {
        return Arrays.stream(input).reduce((el, el2) -> (int) el + (int) el2).orElse(-1);
    }

    public Model method3(final Object... input) {
        return new Model() {{
            value1 = input[0];
            value2 = input[1];
            value3 = input[2];
        }};
    }
}

@FunctionalInterface
interface MyFunction<R> {
    R executeMethod(Object... args);
}

class Model {
    public Object value1;
    public Object value2;
    public Object value3;

    @Override
    public String toString() {
        return "Model{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                ", value3=" + value3 +
                '}';
    }
}

