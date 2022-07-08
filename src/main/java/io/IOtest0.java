package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
拿名字并输出到文件的例子
 */
public class IOtest0 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\MyProject\\java_learning\\src\\main\\resources\\names.txt");



        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            String next = scanner.next();
            if(next.length()==0) break;
            fos.write(next.getBytes(StandardCharsets.UTF_8));
            if (i == 5) {
                fos.flush();
                i = 0;
            }else i++;
        }
        scanner.close();
        fos.close();
    }
}
