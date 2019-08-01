package com.zhu;

import java.util.function.Supplier;

/**
 * 测试生产者
 */
public class TestSupplier {

    public static void main(String[] args) {
        Double aDouble = testSu(() -> (Math.random() * 100));
        System.out.println(aDouble);
    }
    public static Double testSu( Supplier<Double> supplier){
        return supplier.get();
    }
}
