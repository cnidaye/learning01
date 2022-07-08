package bean;

import java.util.Objects;

public class Student {
    String name = "dean";
    transient int age ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void greeting(String name2){
        System.out.println("say hi to: "+name2);
    }
}
