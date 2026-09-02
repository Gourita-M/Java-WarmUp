package org.example.warmup;

public class Student {
    public String name;
    public int note1,note2;

    public Student(String name, int note1 , int note2){
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
    }

    public int calc_avg(){
        int avg = ( this.note1 + this.note2 ) / 2;
        return avg;
    }

    public void show(){
        System.out.println("Hello " + name + " Your Average is: " + calc_avg());
    }
}
