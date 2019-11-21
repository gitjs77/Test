import java.util.Arrays;

public class Cat {
    public String name;
    public int age;
    public String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return  "";
    }

    public static void main(String[] args) {
        String string = "ff";
        final String[] split = string.split(":");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);

    }
}