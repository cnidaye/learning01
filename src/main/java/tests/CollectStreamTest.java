package tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStreamTest {
    public static void main(String[] args) {
        int[] ages = new int[]{1, 23, 34, 12, 23, -100};
        List<Integer> nums = new LinkedList<>();
        for (int age : ages) {
            nums.add(age);
        }
        List<Integer> collect = nums.stream().map(x -> x * 2).sorted().collect(Collectors.toList());
        for (Integer integer : collect) {
            System.out.println(integer);
        }
    }
}
