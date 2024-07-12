package JavaLearn;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDate);  // Output - 2022-03-07
        System.out.println(myTime);  // Output - 09:22:54.814058
        System.out.println(myDateTime);  // Output - 2022-03-07T09:22:54.814058
        // Using formatter.
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String myFormatter = myDateTime.format(myFormat);
        System.out.println(myFormatter);  // Output - seg, mar 07 2022
        }
}
