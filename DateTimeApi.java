
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeApi {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current Date: " + date);

        System.out.println("Current Time: " + time);

        System.out.println("Current Date and Time: " +
                dateTime.format(format));

        System.out.println("Tomorrow's Date: " + date.plusDays(1));

        System.out.println("Yesterday's Date: " + date.minusDays(1));
    }
}
