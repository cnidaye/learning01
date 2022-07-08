package tests;

import java.lang.ref.WeakReference;

public class WeakRefTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("bmw");
        WeakReference<Car> carWeakReference = new WeakReference<>(car);
        System.gc();
        System.out.println("1==> "+ car.getName());
        System.out.println("2==> "+ carWeakReference.get().getName());

        car = null;
        Thread.sleep(3000);
//        System.out.println("3===>" + car.getName());
        System.out.println("3===>" + carWeakReference.get().getName());

        System.gc();
        System.out.println("===after gc==>" + carWeakReference.get());
    }
    static class Car{
        String name;
        public Car(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
