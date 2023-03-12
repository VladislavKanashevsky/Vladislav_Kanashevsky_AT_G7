package day6.methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MethodSeventhStatic {
    public void MethodSeventhProcess(String s) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH.mm dd.MM.y", Locale.ENGLISH);
        Date date = dateFormat.parse(s);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM, dd, y HH:mm", Locale.ENGLISH);
        System.out.println(dateFormat1.format(date));
    }
}
