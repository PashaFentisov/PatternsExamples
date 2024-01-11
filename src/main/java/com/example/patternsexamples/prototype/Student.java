package com.example.patternsexamples.prototype;

import java.util.Objects;

public class Student implements Copyble{
    private String name;
    private String surname;
    private int age;

    public Student(Student student){
        this.name = student.name;
        this.surname = student.surname;
        this.age = student.age;
    }

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Object copy(){
        return new Student(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
