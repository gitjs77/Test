package ListSetTest;

import java.util.ArrayList;
import java.util.List;


public class ListsetTest {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("Petya");
        testList.set(0, "Vasa");

        System.out.println(testList);
    }
}
