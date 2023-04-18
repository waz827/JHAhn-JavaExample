package java0404.staticsample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDate(){
        String localDate= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd  hh:mm:ss"));
        return localDate;
    }
    public static String getCurrentDate(String pattern){
        String localDate= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd  hh:mm:ss"));
        return localDate;
    }
    public static String getCurrentMonth(){
        String localMonth= LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return localMonth;
    }
}
