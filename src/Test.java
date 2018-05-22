/**
 * @Author Jack <e.kobets>
 */
public class Test {
    public static void main(String[] args) {

        String input = "public class Test { " +
                "\ncode;" +
                "\ncode;" +
                "\n}";

        String className = input.substring(input.indexOf("class") + "class".length(), input.indexOf("{")).trim();
        System.out.println(className);
    }
}
