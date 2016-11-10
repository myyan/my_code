package com.freeland.util.performance;

/**
 * Created by chenhao on 2016/9/29.
 */
public class Person {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void doSomething() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+":entry person");
        String number = Thread.currentThread().getName().split("-")[1];
        int num = Integer.valueOf(number);
        if (num%2==0){
            System.out.println(Thread.currentThread().getName()+":blocked");
            Thread.currentThread().sleep(5000);
        }
        System.out.println(Thread.currentThread().getName()+":exit person");
    }

    private static Person person;

    private Person() {

    }

    public static Person getPerson() {
        if (person != null) {
            return person;
        } else {
            person = new Person();
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return password != null ? password.equals(person.password) : person.password == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
