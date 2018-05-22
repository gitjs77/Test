package interface_multiple_extends;

/**
 * @Author Jack <e.kobets>
 * 5/22/18
 */
public interface Parent {
    void setS(String s);

    default void init(){
        setS("ss");
    }
}
