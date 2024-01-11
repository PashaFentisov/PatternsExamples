package com.example.patternsexamples.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    private String phone;


    public static class PersonBuilder{
        private String name;
        private String surname;
        private int age;
        private String address;
        private String phone;
        public PersonBuilder() {
        }

        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder surname(String surname){
            this.surname = surname;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Person build(){
            Person person = new Person();
            person.setName(name);
            person.setSurname(surname);
            person.setAge(age);
            person.setAddress(address);
            person.setPhone(phone);
            return person;
        }
    }
}
