/**
 * @Author E.Kobets <e.kobets@talantarium.com>
 * 7/30/17
 */
public class BooleanCasting {

    public static void main(String[] args) {

        String digitToBoolean0 = "0";
        System.out.println("digitToBoolean0 = \"0\": " + Boolean.parseBoolean(digitToBoolean0)); // false

        String digitToBoolean1 = "1";
        System.out.println("digitToBoolean1 = \"1\": " + Boolean.parseBoolean(digitToBoolean1)); // false

        String digitToBooleanAny = "777";
        System.out.println("digitToBooleanAny = \"777\": " + Boolean.parseBoolean(digitToBooleanAny)); // false

        String stringFalseLowerToBoolean = "false";
        System.out.println("stringFalseLowerToBoolean = \"false\": " + Boolean.parseBoolean(stringFalseLowerToBoolean)); // false

        String stringFalseUpperToBoolean = "FALSE";
        System.out.println("stringFalseUpperToBoolean = \"FALSE\": " + Boolean.parseBoolean(stringFalseUpperToBoolean)); // false

        String stringFalseMixedToBoolean = "fAlSe";
        System.out.println("stringFalseMixedToBoolean = \"fAlSe\": " + Boolean.parseBoolean(stringFalseMixedToBoolean)); // false

        String stringTrueLowerToBoolean = "true";
        System.out.println("stringTrueLowerToBoolean = \"true\": " + Boolean.parseBoolean(stringTrueLowerToBoolean)); // true

        String stringTrueUpperToBoolean = "TRUE";
        System.out.println("stringTrueUpperToBoolean = \"TRUE\": " + Boolean.parseBoolean(stringTrueUpperToBoolean)); // true

        String stringTrueMixedToBoolean = "tRuE";
        System.out.println("stringTrueMixedToBoolean = \"tRuE\": " + Boolean.parseBoolean(stringTrueMixedToBoolean)); // true

        String stringAnyToBoolean = "Any";
        System.out.println("stringAnyToBoolean = \"Any\": " + Boolean.parseBoolean(stringAnyToBoolean)); // false

        System.out.println("======================");

        int intToBoolean0 = 0;
//        System.out.println("intToBoolean = \"0\": " + Boolean.parseBoolean(intToBoolean0)); // compile error

        int intToBoolean2 = 2;
//        System.out.println("intToBoolean2 = \"0\": " + Boolean.parseBoolean(intToBoolean2)); // compile error



    }
}
