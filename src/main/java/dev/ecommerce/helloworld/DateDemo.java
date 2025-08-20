package dev.ecommerce.helloworld;

import java.text.*;
import java.util.*;

public class DateDemo {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());
        SimpleDateFormat ft
                = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(date));

        // display time and date
        String str = String.format("Current Date/Time : %tc", date);

        System.out.printf(str);      // display time and date
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    }
}
