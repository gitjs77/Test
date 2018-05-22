package interface_multiple_extends;

/**
 * @Author Jack <e.kobets>
 * 5/22/18
 */
public interface Child2 extends Parent{

    default void init3(){
        setS("ss3");
    }
}
