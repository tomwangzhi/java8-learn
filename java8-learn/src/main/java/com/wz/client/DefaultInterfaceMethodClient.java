package com.wz.client;

import com.wz.service.Formula;

public class DefaultInterfaceMethodClient {

    public static void main(String[] args) {

        // 匿名接口实现类： 可以理解为返回了一个匿名的接口的实现类，然后让接口指向该实现类
        // 接口和抽象类都不能直接new ，但是都可以通过匿名实现类的方式进行new
        Formula formula = new Formula() {
            @Override
            public double calculate(int var) {
                return sqrt(var);
            }
        };

        System.out.println(formula.calculate(1));
        // 默认方法可以直接调用
        System.out.println(formula.sqrt(2));
    }
}
