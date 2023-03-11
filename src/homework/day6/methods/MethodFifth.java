package day6.methods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodFifth {

    public void MethodFifthProcess() {
        DateFormat dateFormat = new SimpleDateFormat("d MMMM y, HH часа mm минут");
        String date = dateFormat.format(new Date());
        System.out.println("Сейчас на дворе: " + date);
    }
}

