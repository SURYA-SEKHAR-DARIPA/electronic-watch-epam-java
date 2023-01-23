package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        
        int second = seconds % 60;
        int minute = (seconds / 60) % 60;
        int hour = seconds / 3600;
        String strSecond = (second < 10) ? "0" + second : Integer.toString(second);
        String strMinute = (minute < 10) ? "0" + minute : Integer.toString(minute);
        String strHour = (hour < 10) ? "" + hour : ((hour == 24) ? "0" : Integer.toString(hour));
        System.out.println(strHour + ":" + strMinute + ":" + strSecond);



    }
}
