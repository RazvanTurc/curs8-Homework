package ro.fasttrackit.curs8.homework4;

public class MainStudents {
    public static void main(String[] args) {
        Student student1  = new Student("Mihai", 88);
        Student student2  = new Student("Costel", 67.55);
        Student student3  = new Student("Bogdan", 84.34);
        Student student4  = new Student("Raul", 65.05);
        Student student5  = new Student("Dana", 72.57);
        Student student6  = new Student("Andrei", 42);
        Student student7  = new Student("Victor", 71);
        Student student8  = new Student("Andreea", 97.66);
        Student student9  = new Student("Marisa", 41.7);
        Student student10 = new Student("Eva", 99.98);

        System.out.println(
                "Grades before average: " + Student.GRADESUM + "\n" +
                "Number of students: "    + Student.STUDENTS
        );
        System.out.println("Grades average: " + Student.sumAverage());
    }
}
