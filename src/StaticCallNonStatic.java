/**
 * @Author Jack <e.kobets>
 */
public class StaticCallNonStatic {

    public String str;


    public static void staticMethod(){
    }

    public void method(){
        staticMethod();
        new Nested();
    }

    static class Nested{

    }
}
