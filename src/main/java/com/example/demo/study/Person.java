package com.example.demo.study;

import java.util.Objects;

/**
 * @author jiange
 * @date 2020/11/18 17:14
 */
public class Person {
    private int age;
    private String sez;
    private String name;

    public Person(int age, String sez, String name) {
        this.age = age;
        this.sez = sez;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSez() {
        return sez;
    }

    public void setSez(String sez) {
        this.sez = sez;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(sez, person.sez) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sez, name);
    }
}
