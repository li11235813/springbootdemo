package com.mycode.firstdemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 测试stream
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        list.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).sorted()
                .forEach(System.out::println);
    }
}
