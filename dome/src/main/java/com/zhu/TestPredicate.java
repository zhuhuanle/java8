package com.zhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 测试断言
 */
public class TestPredicate {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","1234","23456");
        List<String> string = getString(list, (s) -> s.length() > 3);
        System.out.println(string);

    }
    public static List<String> getString(List<String> list, Predicate<String> predicate){
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)){
                list1.add(s);
            }
        }
        return list1;
    }
}
