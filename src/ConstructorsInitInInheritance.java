/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 * 7/30/17
 */
public class ConstructorsInitInInheritance {

    public static void main(String[] args) {

        /**
         SupperClass constructor Parent.
         instanceof Parent && instanceof Child
         instanceof Parent
         instanceof Child
         ChildClass constructor Child.
         instanceof Parent && instanceof Child
         instanceof Parent
         instanceof Child
         */
        Parent parent = new Child();

        /**
        SupperClass constructor Parent.
        instanceof Parent
         */
//        Parent parent1 = new Parent();

        /**
         SupperClass constructor Parent.
         instanceof Parent && instanceof Child
         instanceof Parent
         instanceof Child
         ChildClass constructor Child.
         instanceof Parent && instanceof Child
         instanceof Parent
         instanceof Child
         */
//        Child child = new Child();
    }
}

