package com.example.BatchProcessing;

public class Person {

    private String firstname;
    private String Lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
