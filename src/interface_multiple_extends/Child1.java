package interface_multiple_extends;

/**
 * @Author Jack <e.kobets>
 * 5/22/18
 */
public interface Child1 extends Parent{

    default void init2(){
        setS("ss2");
    }
}
