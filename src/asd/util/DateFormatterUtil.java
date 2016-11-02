package asd.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by chenhao on 2016/9/23.
 */
public class DateFormatterUtil {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static LocalDate stringToLocalDate(String date){
        return LocalDate.parse(date,formatter);
    }
}

