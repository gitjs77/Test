import java.math.BigDecimal;

/**
 * @Author Jack <e.kobets>
 * 10/31/17
 */
public class BigDecimalTestScale {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal result = bigDecimal.setScale(2);
        System.out.println(result);
    }
}


