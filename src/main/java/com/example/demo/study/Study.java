package com.example.demo.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jiange
 * @date 2020/11/18 15:33
 */
public class Study {
    public static void main(String[] args) {
        Person person1 = new Person(12,"男","张三");
        Person person2 = new Person(12,"男","张三");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}
