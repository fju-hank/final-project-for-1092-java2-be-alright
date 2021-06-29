package com.fju;

public class Score {
    String name;
    int chinese;
    int english;
    int math;
    int science;
    int average;

    public Score(String name, int chinese, int english, int math, int science) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        this.science = science;

    }

    public Score() {

    }

    public int average() {
        return average = (chinese + english + math + science) / 4;


    }

    public void print() {
        //System.out.println("name"+"\t"+"chinese"+"\t"+"english"+"\t"+"math"+"\t"+"science");
        System.out.println(name + "\t" + chinese + "\t" + english + "\t" + math + "\t" + science + "\t");
    }

}






