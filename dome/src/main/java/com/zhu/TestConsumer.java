package com.zhu;

import java.util.function.Consumer;

/**
 * 测试消费者
 */
public class TestConsumer {

    public static void main(String[] args) {
        testConsumer(100, (a) -> System.out.println(a));
    }

    public static void testConsumer(Integer a, Consumer<Integer> consumer){
        consumer.accept(a);
    }
}
