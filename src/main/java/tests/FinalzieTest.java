package tests;

import bean.Student;

import java.lang.ref.WeakReference;

public class FinalzieTest {
    public static void main(String[] args) throws InterruptedException {
        MyStudent jack = new MyStudent("jack", 123);
        WeakReference<MyStudent> weakJack = new WeakReference<>(jack);

        System.gc();
        System.out.println(jack.getName());

        jack = null;
        Thread.sleep(3000);

        System.gc();


    }

    private static class MyStudent extends Student{

        public MyStudent(String name, int age) {
            super(name, age);
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("to be finalized");
        }
    }
}


