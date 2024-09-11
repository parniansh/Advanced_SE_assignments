package org.example;

import java.util.List;

public class Course {

   private String name;
   private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(String name, Instructor[] instructors, Textbook[] textbooks) {
        this.name = name;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public String getName() {
        return name;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public Textbook[] getTextbooks() {
        return textbooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }

    public void printCourse(){

        System.out.printf("Course name : %s%n", getName());
        for (Instructor instructor : instructors)
            System.out.printf("Instructor's first and last name : %s, %s%n", instructor.getFirstName(), instructor.getLastName());
        for (Textbook textbook : textbooks)
            System.out.printf("Textbook title: %s, Textbook author: %s%n", textbook.getTitle(), textbook.getAuthor());
    }
}
