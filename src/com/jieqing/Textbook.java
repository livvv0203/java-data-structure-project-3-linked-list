package com.jieqing;

public class Textbook {

    // Instance Variables
    private String course;
    private String title;
    private Person author;
    private double price;

    // No-argument constructor
    public Textbook() { }

    // constructor declaration
    public Textbook(String course, String title, String authorName,
                    int age, double price)
    {
        this(course, title, new Person(authorName, age), price);
    }

    // Construction declaration of Class regular
    public Textbook(String c, String t, Person p, double pr) {
        course = c;
        title = t;
        author = p;
        price = pr;
    }

    // getMethods
    public String getCourse() { return course;}
    public String getTitle() { return title; }
    public Person getAuthor() { return author; }
    public double getPrice() {return price; }

    // setMethods
    public void setCourse(String c) {
        course = c;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setAuthor(Person p) {
        author = p;
    }
    public void setPrice (double pr) {
        price = pr;
    }

    public String toString() {
        return "\tCourse: " + course +
                "\n\tTitle: " + title +
                "\n\tAuthor: " + "Name = "
                + author.getName()
                + ", Age = "
                + author.getAge() +
                "\n\tPrice: " + price + "\n";
    }
}
