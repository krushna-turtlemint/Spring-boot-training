package com.mrmk.learnjpahibernatelearning.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private int Id;
    private String Name;
    private String Author;

    public Course() {

    }

    public Course(int id, String name, String author) {
        Id = id;
        Name = name;
        Author = author;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }

    public void setAuthor(String author) {
        Author = author;
    }


}
