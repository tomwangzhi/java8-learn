package com.wz.service;

public interface Formula {

    double calculate(int var);
    // 接口的默认方法
    default double sqrt(int var) {
        return Math.sqrt(var);
    }

}
