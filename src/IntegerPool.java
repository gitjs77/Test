/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 */
public class IntegerPool {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);// true, value < 128
        System.out.println("======================");

        Integer i3 = 300;
        Integer i4 = 300;
        System.out.println(i3 == i4); // false, value >= 128
        System.out.println("======================");

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i3 == i4); // false, value >= 128
    }
}
