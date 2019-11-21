package enum_compare;

/**
 * @Author Jack <e.kobets>
 * 7/11/18
 */
public class EnumCompare {

    public static void main(String[] args) {

        TesEnum tesEnum = null;

        System.out.println(tesEnum == TesEnum.TEST);
        System.out.println(TesEnum.TEST == tesEnum);
//        System.out.println(tesEnum.equals(TesEnum.TEST)); // NPE
        System.out.println(TesEnum.TEST.equals(tesEnum));
    }

    enum TesEnum{
        TEST
    }
}
