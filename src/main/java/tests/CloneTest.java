package tests;

import bean.Student;

import java.util.LinkedList;

public class CloneTest {
    public static void main(String[] args) {
        test1();

    }

    static void test1(){
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("lucy", 12));
        students.add(new Student("jack", 15));

        System.out.println(students.get(0));

        LinkedList<Student> clone = (LinkedList<Student>) students.clone();

        System.out.println(students.get(0)==clone.get(0));

//        for (Student student : students) {
//            System.out.println(student + "  " +student.hashCode());
//        }
//
//        for (Student student : (LinkedList<Student>) students) {
//            System.out.println(student + "  " +student.hashCode());
//        }

    }

    static void test2(){
        Student student = new Student("jack", 12);

    }
}
