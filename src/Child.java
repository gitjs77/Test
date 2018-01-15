


public class Child extends Parent {

    public String fieldOfChild = "fieldOfChild";

    public Child() {
        System.out.println("ChildClass constructor Child.");

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

    public void methodOfChild(){
        System.out.println("methodOfChild");
    }
}
