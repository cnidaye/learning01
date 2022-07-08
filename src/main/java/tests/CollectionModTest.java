package tests;

import bean.Student;

import java.util.Iterator;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionModTest {
    public static void main(String[] args) {
        new CollectionModTest().test3();

    }

    void test1(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        Iterator<String> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (count == 5) {
                list.remove(5);
            }
            System.out.println(iterator.next());
            count++;
        }

    }

    void test2(){
        LinkedList<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("3");

        Iterator<String> it = strings.iterator();

        while (it.hasNext()) {
            if (it.next().equals("3")) {
                strings.remove(2);
            }
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }

    void test3(){
        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<>();
        q.add("hello");
        q.add("world");
        q.add("busy");




    }

}
