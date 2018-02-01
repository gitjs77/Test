package ConstructorsInTheSubClasses;

/**
 * @Author Jack <e.kobets>
 */
public class ConstructorsWithSublasses {

    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
    }
}

class Parent {
    public String name;

    public Parent() {
    }

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    public String name;
}
