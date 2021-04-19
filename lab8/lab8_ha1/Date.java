package com.company;

public class Date {
    private int day;
    private int month;
    private  int year;

    public Date(int day,int month,int year){
        this.year = year;
        this.month = checkMonth(month);
        this.day = checkDay(day);

    }

    public int checkMonth(int testMonth){
        if (testMonth>0 && testMonth <=12){
            return testMonth;
        }
        else {
            System.out.println("Invalid month so "+testMonth+" set to 1");
            return 1;
        }
    }
    public int checkDay(int testday){
        int[] daysOfmonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (testday > 0 && testday<=daysOfmonth[month]){
            return testday;
        }
        else if (month == 2 && testday == 29 && (year%400 == 0 || (year%4 == 0 && year%100 != 0))){
            return testday;
        }
        else {
            System.out.println("Invalid day "+testday+" set to 1");
            return 1;
        }
    }
    public String display(){
        return (day+"-"+month+"-"+year);
    }
}
