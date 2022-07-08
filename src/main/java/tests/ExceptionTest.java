package tests;

import bean.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;

public class ExceptionTest {
    public static void main(String[] args) {
        test1();
    }

    static void test1() {
        MyCollection students = new MyCollection();
        students.add(new Student("jack", 12));
        students.add(new Student("bad", 13));
        students.find("bad");
        try {
            System.out.println(students.find("bad"));
        } catch (IllegalElementException e) {
            System.out.println("1===>getMessage");
            System.out.println(e.getMessage());
            // 获取到throwable对象
//            System.out.println(e.getCause());
            System.out.println("3=====>getStacktrace");
            System.out.println(e.getStackTrace()[0].getClassName());
            System.out.println("4=====>printStackTrace");
            e.printStackTrace();

        }
    }

    static void test2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\123.txt");
        
    }

    /*

     */
    static class IllegalElementException extends RuntimeException{
        public IllegalElementException(String msg) {
            super(msg);
        }
    }
    /*

     */
    static class MyCollection extends LinkedList<Student> {
        public boolean find(String name)  {
            if(name.equals("bad")){
                throw new IllegalElementException("the name " + name + " is not legal");
            }else return this.contains(name);
        }
    }

}
