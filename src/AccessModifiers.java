/**
 * @Author Jack <e.kobets>
 */
public class AccessModifiers {

    String packagePrivateField;
    protected String protectedField;


    public class Child {

        public void method() {

            System.out.println(packagePrivateField);
            System.out.println(protectedField);
        }
    }
}