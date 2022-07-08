package tests;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(s);
        }
        System.out.println(sb.length());
        sb.setLength(0);
        System.out.println(sb.length());
    }
}
