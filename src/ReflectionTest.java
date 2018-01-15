import java.lang.reflect.Method;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 */
public class ReflectionTest {

    public static void main(String[] args) {

        Object test = new Object();

        System.out.println(new ReflectionTest().getInputArgName(test));
    }

    public String getInputArgName(Object arg) {

        return "getCanonicalName: " + arg.getClass().getCanonicalName()
                + "\n getName: " + arg.getClass().getName()
                + "\n getSimpleName: " + arg.getClass().getSimpleName()
                + "\n getTypeName: " + arg.getClass().getTypeName()
                + "\n getDeclaredMethods: " +
                Stream.of(arg.getClass()
                        .getDeclaredMethods())
                        .map(Method::getName)
                        .collect(Collectors.toList());
    }
}
