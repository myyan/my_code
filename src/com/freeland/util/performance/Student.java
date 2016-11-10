package com.freeland.util.performance;

/**
 * Created by chenhao on 2016/10/9.
 */
public class Student {
    private String name;
    private int age;
    private long fee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public Student(String name, int age, long fee) {
        this.name = name;
        this.age = age;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fee=" + fee +
                '}';
    }
}
