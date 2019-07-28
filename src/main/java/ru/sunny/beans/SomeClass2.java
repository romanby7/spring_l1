package ru.sunny.beans;

public class SomeClass2 {

    String name;
    String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SomeClass2() {
    }


    @Override
    public String toString() {
        return "SomeClass2{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
