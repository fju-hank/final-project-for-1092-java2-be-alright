package com.fju;

import java.util.Calendar;
import java.util.Date;

public class Car {
    String id;
    String time;
    Date enter;


    public Car(String id, String time) {
        this.id = id;
        enter = new Date();
        Calendar now = Calendar.getInstance();
        String[] tokens = time.split(":");
        System.out.println("t0" + tokens[0]);
        System.out.println("t1" + tokens[1]);
        now.set(Calendar.HOUR_OF_DAY, 8);
        enter = now.getTime();

    }

    public Date getEnter() {
        return enter;
    }
}
