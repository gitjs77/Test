import java.util.HashMap;
import java.util.Map;

public class PutNullIntoTheMap {
    public static void main(String[] args) {

        Map<?, String> map = new HashMap<>();
        map.put(null, "First value");
        map.put(null, "Second value");

        System.out.println(map);
    }
}