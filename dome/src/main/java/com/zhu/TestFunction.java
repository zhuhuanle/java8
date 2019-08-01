package com.zhu;

import java.util.function.Function;

/**
 * 测试function
 */
public class TestFunction {

    public static void main(String[] args) {

        String string = getString(100, (a) -> a.toString());
        System.out.println(string);
    }

    public static String getString(Integer a, Function<Integer, String> fn){
        return fn.apply(a);
    }
}
