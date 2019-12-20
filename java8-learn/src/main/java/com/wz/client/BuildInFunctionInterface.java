package com.wz.client;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuildInFunctionInterface {

    public static void main(String[] args) {

        // lambada表达式的引用
        Predicate<String> predicate = (s) -> s.length() > 0;

        // 调用具体的方法
        boolean aa = predicate.test("aa");
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        // String::isEmpty; 理解为指向一种对象的实现test方法
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        // 先转为整型然后转为String
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");     // "123"

        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person


        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");
        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0



        //of（）：为非null的值创建一个Optional
        Optional<String> optional = Optional.of("bam");
// isPresent（）： 如果值存在返回true，否则返回false
        optional.isPresent();           // true
//get()：如果Optional有值则将其返回，否则抛出NoSuchElementException
        optional.get();                 // "bam"
//orElse（）：如果有值则将其返回，否则返回指定的其它值
        optional.orElse("fallback");    // "bam"
//ifPresent（）：如果Optional实例有值则为其调用consumer，否则不做处理
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}
