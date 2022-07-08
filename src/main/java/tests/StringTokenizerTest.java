package tests;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String s = "apple,adf,adf,wer";
        StringTokenizer tokenizer = new StringTokenizer(s, ",");
//        while (tokenizer.hasMoreTokens()) {
//            System.out.println(tokenizer.nextToken());
//        }
        System.out.println(tokenizer.nextToken());
    }
}
