package com.xu.jdk8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        TheInterface theInterface = () -> {};
//        System.out.println(theInterface.getClass().getInterfaces()[0]);
//
//        TheInterface2 theInterface2 = () -> {};
//        System.out.println(theInterface2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> {
//            System.out.println("thread is invoked!!");
//        }).start();

        List<String> list = Arrays.asList("hello","world","person");
        list.forEach((str) -> System.out.println(str.toUpperCase()));
// 菱形语法<> since 1.8
        List<String> list2 = new ArrayList<>();
//        list.forEach(item -> list2.add(item.toUpperCase()));
//        list2.forEach(item -> System.out.println(item.toUpperCase()));

        list.stream();

    }
}

@FunctionalInterface
interface TheInterface {
    void myMethod();
}

@FunctionalInterface
interface TheInterface2 {
    void myMethod2();
}