package io;

import bean.Student;

import java.io.*;

public class ObjectSeriTest {
    static class MyStudent extends Student implements Serializable{

        public MyStudent(){
            super();

        }
        public MyStudent(String name, int age) {
            super(name, age);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyStudent jack = new MyStudent("jack", 123);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\MyProject\\java_learning\\src\\main\\resources\\obj"));
        oos.writeObject(jack);
        oos.close();
        System.out.println("output done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\MyProject\\java_learning\\src\\main\\resources\\obj"));
        Object o = ois.readObject();
        if (o instanceof MyStudent) {
            MyStudent student = (MyStudent) o;
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
        ois.close();
    }
}
