package ru.sunny.beans;

import org.springframework.stereotype.Component;

@Component
public class SomeClass1 {

    String name;
    String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SomeClass1() {
    }

    @Override
    public String toString() {
        return "SomeClass1{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
