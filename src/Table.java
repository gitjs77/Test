/**
 * Table class for tables representation.
 */
class Table {
    double hight = 1.5; // in meters
    double width = 2.25;// im meters
    Cup cup = new Cup();
    Cup cup2 = new Cup(4);

    @Override
    public String toString() {
        return "Table{" +
                "hight=" + hight +
                ", width=" + width +
                ", cup=" + cup +
                ", cup2=" + cup2 +
                '}';
    }

    static void showAbilities() {
        Table concreteTable = new Table();
        System.out.println(concreteTable);
    }

    public static void main(String[] args) {
        showAbilities();
    }
}

class Cup {
    double volume;

    public Cup() {
    }

    public Cup(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                '}';
    }
}