package com.github.zipcodewilmington.sample;

public class Person {

    
    private String firstName;
    private String lastName;
    private Integer getAge;


    public Person() {}
    public Person(String firstName, String lastName, Integer age) {
        this.firstName = "";
        this.lastName = "";
        this.getAge = age;
}

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getAge() {
        return getAge;
    }

    public void setAge(Integer age) {
        this.getAge = age;
    }



}

