package com.jieqing;

// Class Declaration
public class Person
{
    // Two Instance Variables
    String name;
    int age;

    // No-argument constructor
    public Person() { }

    // Construction declaration of Class
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // getName Method
    public String getName()
    {
        return name;
    }

    // getAge Method
    public int getAge()
    {
        return age;
    }

    // setName Method
    public void setName(String n)
    {
        name = n;
    }

    // setAge Method
    public void setAge(int a)
    {
        age = a;
    }

    public String toString()
    {
        return String.format("name = %-9s age = %-5d", name, age);

    }

}
