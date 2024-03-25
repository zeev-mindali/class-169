package exam_prep_08_01.DateCls;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFactory {
    public static LocalDate getLocalDate(){
        int day = (int)(Math.random()*28+1); // 1->28
        int month = (int)(Math.random()*12+1); // 1->12
        int year = (int)(Math.random()*51+1960);  //1960->2010
        LocalDate date = LocalDate.of(year,month,day);
        return date;
    }

    public static String beautifyDate(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
