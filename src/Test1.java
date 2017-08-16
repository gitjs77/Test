



class Test1 extends Super {
    int three = (int) Math.PI;  // That is, 3

    void printThree() {
        System.out.println(three);
    }

    Test1() {
        super();
        System.out.println("Test1");
        printThree();
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.printThree();
    }
}

class Super {
    Super() {
        System.out.println("Super");
        printThree();
    }

    void printThree() {
        System.out.println("three");
    }
}