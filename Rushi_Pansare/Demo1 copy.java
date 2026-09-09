package com.Multithreading;

class Classroom {

    synchronized void waitForTeacher() {

        try {
            System.out.println(
                Thread.currentThread().getName() +
                " is waiting for teacher..."
            );

            wait();

            System.out.println(
                Thread.currentThread().getName() +
                " started studying."
            );

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void notifyOneStudent() {

        System.out.println("Teacher arrived!");
        System.out.println("Teacher calls notify()");

        notify();
    }

    synchronized void notifyAllStudents() {

        System.out.println("Teacher calls notifyAll()");

        notifyAll();
    }
}

public class Demo1 {

    public static void main(String[] args)
            throws InterruptedException {

        Classroom classroom = new Classroom();

        Thread student1 = new Thread(
            classroom::waitForTeacher,
            "Student-1"
        );

        Thread student2 = new Thread(
            classroom::waitForTeacher,
            "Student-2"
        );

        Thread student3 = new Thread(
            classroom::waitForTeacher,
            "Student-3"
        );

        // Students start waiting
        student1.start();
        student2.start();
        student3.start();

        Thread.sleep(1000);

        // Wake ONE student
        classroom.notifyOneStudent();

        Thread.sleep(1000);

        // Wake ALL remaining students
        classroom.notifyAllStudents();
    }
}