import com.sun.javafx.binding.StringFormatter;

/**
 * @Author Jack <e.kobets>
 */
public class StringTemplateTest {

    public static void main(String[] args) {

        String string = "Gets random id = %s. From table: %S";
        System.out.println(StringFormatter.format("Gets random id = %s. From table: %S", 2, 3).getValue());
    }
}
