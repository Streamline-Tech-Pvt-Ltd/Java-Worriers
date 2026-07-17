package rushi.main.constructorClass;

class Std {
    int rollNo;
    String name;

    // Default Constructor
    Std() {
        this(101, "Rushikesh");   // Calls parameterized constructor
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    Std(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
    	Std s1 = new Std();
        s1.display();
    }
}