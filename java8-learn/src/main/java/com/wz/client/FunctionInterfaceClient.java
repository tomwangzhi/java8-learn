package com.wz.client;


import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceClient {
    public static void main(String[] args) {

        // 函数式接口引用Callable
        Callable<String> callable = () -> "aa";
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("aa");



    }
}
