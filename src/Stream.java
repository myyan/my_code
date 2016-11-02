import asd.util.DateFormatterUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by chenhao on 2016/9/23.
 */
class Stream1 {
    public static void main(String []args){
//        String concat = Stream.of("A","B","C").reduce("",String::concat);
//        System.out.println(concat);
//        LocalDate date = LocalDate.of(2015,11,10);
//        System.out.println(date);
//        System.out.println(String.format("new date,%s",date.toEpochDay()));
        String date1 = "20150321";
        String date2 = "20160322";
//        System.out.println(DateFormatterUtil.stringToLocalDate(date1).minusDays(50).plusYears(1));
//        Date date = new Date(System.currentTimeMillis());
//        Date date3 = new Date();
//        System.out.println(String.format("current date:%s,date3 %s",date,date3));
        LocalDate date3 = DateFormatterUtil.stringToLocalDate(date1);
        LocalDate date4 = DateFormatterUtil.stringToLocalDate(date2);
        System.out.println(date4.compareTo(date3.minusDays(7)));
        LocalDateTime localDateTime = LocalDateTime.of(2016,12,31,12,12,28);
        Date date = new Date();
        System.out.println(date.toString());
        List<String> list = Arrays.asList("wifi","3g","eth");
        List<Integer> list2 = Arrays.asList(1,2,3);
//        System.out.println(list2.stream().forEach(x-> x.compareTo(1)));

    }
}
