package com.gl.demo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var list = List.of(1,2,3,4,5);

        System.out.println(list);

        list.stream().filter(e->e%2==0).forEach(System.out::println);

    }
}
