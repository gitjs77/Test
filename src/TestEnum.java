import java.util.Arrays;

/**
 * @Author Jack <e.kobets>
 */
public enum TestEnum {

    NEW, ACTIVE;

    public static void main(String[] args) {

        System.out.println("NEW.name(): " + NEW.name());
        System.out.println("ACTIVE.name(): " + TestEnum.ACTIVE.name());

        Arrays.stream(TestEnum.values()).forEach(System.out::println);
    }
}
