package rushi.main.constructorClass;


class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void studyWithTeacher(Teacher t) {
        System.out.println(name + " is studying with " + t.name);
        t.teach();
    }
}

public class AssociationDemo {

    public static void main(String[] args) {

        Teacher t = new Teacher("Rahul");

        Student s = new Student("Rushikesh");

        s.studyWithTeacher(t);
    }
}
//
//Why is this Association?
//
//Because:
//
//A Student uses a Teacher.
//A Teacher can exist without a Student.
//A Student can exist without a specific Teacher.
//Both objects have independent lifecycles.
//
//This is why it is called Association