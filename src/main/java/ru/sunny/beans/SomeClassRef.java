package ru.sunny.beans;

public class SomeClassRef {
    SomeClass3 someClass3;

    public void setSomeClass3(SomeClass3 someClass3) {
        this.someClass3 = someClass3;
    }

    public SomeClassRef() {
    }

    public void print() {
        System.out.println(someClass3.toString());
    }
}
