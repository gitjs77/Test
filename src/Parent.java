/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 * 7/30/17
 */
public class Parent {

    public String fieldOfParent = "fieldOfParent";

    public Parent() {
        System.out.println("SupperClass constructor Parent.");

        if (this instanceof Parent && this instanceof Child) {
            System.out.println("instanceof Parent && instanceof Child");
        }
        if (this instanceof Parent) {// condition is always true
            System.out.println("instanceof Parent");
        }
        if (this instanceof Child) {
            System.out.println("instanceof Child");
        }
    }

    public void methodOfParent(){
        System.out.println("methodOfParent");
    }


}
