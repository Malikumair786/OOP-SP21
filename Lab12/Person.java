package com.company;

public class Person {
    protected String name;
    protected String id;

    public Person(String name,String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id='" + id + '\'';
    }
}
