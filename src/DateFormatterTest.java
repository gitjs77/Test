import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author Jack <e.kobets>
 * 4/26/18
 */
public class DateFormatterTest {
    public static void main(String[] args) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        final String formattedCurrentDateAndTime = LocalDateTime.now().format(formatter);
        System.out.println(formattedCurrentDateAndTime);
    }
}
