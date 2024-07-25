package com.example;

public class StudyGroup {
    private String name;

    public StudyGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "name='" + name + '\'' +
                '}';
    }
}