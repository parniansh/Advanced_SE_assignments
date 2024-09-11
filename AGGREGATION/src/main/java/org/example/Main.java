package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    Instructor instructor1 = new Instructor("Nima1", "Davarpanah1", "3-2636");
    Instructor instructor2 = new Instructor("Nima2", "Davarpanah2", "3-2637");
    Textbook textbook1 = new Textbook("Clean code1", "Robert Martin1", "Pearson Education1");
    Textbook textbook2 = new Textbook("Clean code2", "Robert Martin2", "Pearson Education2");
    Course course = new Course("Advanced Software Engineering", new Instructor[] {instructor1, instructor2},
                                new Textbook[] {textbook1, textbook2});
    course.printCourse();

    }
}