import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupingByExample {
    public static void main(String[] args) {


        Map<String, Long> finalMap = new LinkedHashMap<>();
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");



        items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                // Your code before put into the finalMap
                .forEach(e -> finalMap.put(e.getKey(), e.getValue()));
    }
}
