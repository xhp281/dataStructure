package com.xhp281;

/**
 * User: FenDou
 * Date: 2019-05-17 18:13
 * Description:
 */

public class Person implements Comparable<Person> {
    public int age;
    public String name;

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person e) {
//        if (age > e.age) return 1;
//        if (age < e.age) return -1;
//        return 0;
        return age - e.age;
    }

    @Override
    public String toString() {
        return "" + age + "-" + name;
    }
}
