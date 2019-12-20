package com.wz.service;

/**
 * 定义自己的函数式转换接口，可以将 T 转为 S  类型
 * @param <T>
 * @param <S>
 */
@FunctionalInterface
public interface MyConverter<T,S> {

    S myconvert(T t);
}
