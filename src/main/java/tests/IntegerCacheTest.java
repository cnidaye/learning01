package tests;

public class IntegerCacheTest {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = -128;
        Integer d = -128;
        Integer e = 1000;
        Integer f = 1000;
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        System.out.println(e.equals(f));
    }
}
