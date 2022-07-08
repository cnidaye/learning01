package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IOStreamCopy {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\MyProject\\java_learning\\src\\main\\resources\\names.txt");
        FileOutputStream fos = new FileOutputStream("D:\\MyProject\\java_learning\\src\\main\\resources\\copy.txt");
        FileChannel channel = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(16);
//        while ()
    }
}
