/**
 * @Author Jack <e.kobets>
 */
public class CallStaticMethodFormNullLink {

    public static void main(String[] args) {
        CallStaticMethodFormNullLink callStaticMethodFormNullLink = null;
        callStaticMethodFormNullLink.method();
    }

    static void method () {
        System.out.println("method");
    }
}
