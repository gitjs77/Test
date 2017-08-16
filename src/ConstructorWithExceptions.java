import java.sql.SQLException;

public class ConstructorWithExceptions {

    public class Parent {

        public Parent() throws SQLException {
        }
        public void method() throws Exception {
        }
    }
    public class Child extends Parent {

        public Child() throws Exception {// У наследника или такой же или более широкий exception
        }
        public void method() throws SQLException {// У наследника или меньше или такой же.
        }
    }
}
