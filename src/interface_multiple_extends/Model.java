package interface_multiple_extends;

/**
 * @Author Jack <e.kobets>
 */
public class Model implements Child1, Child2{
    private String s; //state

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}

class Child extends Model{

    public static void main(String[] args) {
        Model m = new Model();
        m.init3();
        System.out.println(m.getS());

    }
}
