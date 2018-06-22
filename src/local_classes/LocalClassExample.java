package local_classes;

/**
 * @Author Jack <e.kobets>
 */
public class LocalClassExample {

    public static void main(String[] args) {
        LocalClassExample localClassExample = new LocalClassExample();
        localClassExample.methodWithLocalClass();
        localClassExample.methodWhoTryCallClassFromAnotherMethod();
    }

    public void methodWithLocalClass() {

        class LocalClass {
            public void localClassNonStaticMethod() {
                System.out.println("localClassNonStaticMethod()");
            }

            private void privateLocalClassNonStaticMethod() {
                System.out.println("privateLocalClassNonStaticMethod()");
            }
        }

        final LocalClass localClass = new LocalClass();
        localClass.localClassNonStaticMethod();
        localClass.privateLocalClassNonStaticMethod();
    }

    public void methodWhoTryCallClassFromAnotherMethod() {
        this.methodWithLocalClass();
    }
}
