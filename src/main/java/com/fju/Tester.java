package com.fju;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List Car = new ArrayList();
       // Car.add(new Car1());
        System.out.println(Car);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date d = sdf.parse("06:20");
            System.out.println(d);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();

//        cal.set(Calendar.HOUR_OF_DAY, 8);
//        cal.set(Calendar.MINUTE, 30);

        System.out.println(cal.getTime());


        Car car = new Car("abc-123", "07:20");
        Car car1 = new Car("def-234", "07:50");
        System.out.println(car.enter);

        Date now = new Date();
        System.out.println(now.getTime());

        long dis = now.getTime() - car.enter.getTime();
        System.out.println(dis);
    }
}

