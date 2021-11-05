package ro.fasttrackit.curs8.homework4;

import java.util.Objects;

public class Student {
    private String name;
    private double grade;
    static double  GRADESUM;
    static int     STUDENTS;

    Student(String name, double grade) {
        this.name  = Objects.requireNonNullElse(name, "NOT NAME");
        this.grade = (Math.abs(grade) < 100 && Math.abs(grade) > 0)? Math.abs(grade) : 50;
        STUDENTS++;
        GRADESUM += this.grade;
    }

    public String getName()    { return name; }
    public double getGrade()   { return grade; }
    static double sumAverage() { return GRADESUM/STUDENTS; }

}
