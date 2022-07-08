package tests;

import bean.Student;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        Student jack = new Student("jack", 123);
        Student jack2 = new Student("jack", 123);

        HashSet<Student> students = new HashSet<>();

        students.add(jack);
        students.add(jack2);

        students.forEach(System.out::println);
    }
}
