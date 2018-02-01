import java.util.Arrays;


public class Varargs {
    public static void main(String[] args) {

        String[] arr = new String[7];
        String[] arr2 = {"Vasa", "Petya"};
        varargsMethod(arr, arr2);
    }

    public static void varargsMethod(final Object... objects){
       Arrays.stream(objects)
               .forEach( it -> System.out.println(Arrays.deepToString((Object[])it)));
    }
}
