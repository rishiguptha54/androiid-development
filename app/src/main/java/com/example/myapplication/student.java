package com.example.myapplication;

public class student {
    String name;
    int age;
    String postaladdress;

    public student(String name, int age, String postaladdress) {
        this.name = name;
        this.age = age;
        this.postaladdress = postaladdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPostaladdress() {
        return postaladdress;
    }

    public void setPostaladdress(String postaladdress) {
        this.postaladdress = postaladdress;
    }
}
