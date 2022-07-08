package tests;

public class StaticTest {
    public static void main(String[] args) {
//        Father jack = new Father("jack");
        System.out.println("=========");
        Son son = new Son("123");
        son.play();
    }

    static class Father{
        String name;
        static String addr = "Green road";

        static {
            System.out.println("log from father");
        }

//        public Father() {
//            System.out.println("father's empty cons");
//        }

        public Father(String name) {
            this.name = name;
            System.out.println("father's cons");
        }
    }
    static class Son extends Father{

        static{
            System.out.println("log from son");
        }

        public Son(String name) {
            super(name);
            this.name = "";
            System.out.println("son's cons");
        }

        public void play() {
            System.out.println("playing football");
        }
    }

    class test1{}
    class test2 extends test1{}
}
