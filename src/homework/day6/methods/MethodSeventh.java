package day6.methods;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MethodSeventh {
    public void MethodSeventhProcess(String string) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH.mm dd.MM.y");
        Date date = dateFormat.parse(string);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        cal.add(Calendar.DATE, 5);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd MMMM");
        System.out.println("Сгенерированная гласная дата: " + dateFormat1.format(cal.getTime()));
    }
}